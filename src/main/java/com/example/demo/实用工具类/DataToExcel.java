package com.example.demo.实用工具类;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

import java.io.FileOutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
  * 数据到excel
  *
  * @author: qinjie
 **/
public class DataToExcel {
	/*
	 * rowDatas:代表传递过来的excel表中的列名和每行的数据
	 * outputType:代表输出种类，目前  -1代表文件输出到本地
	 */
	public static boolean ToExcel(List<List<Object>>rowDatas, Integer outputType) {
		@SuppressWarnings("resource")
		HSSFWorkbook wb = new HSSFWorkbook();//定义一个excel文件
		HSSFSheet sheet = wb.createSheet();//
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);
		HSSFRow row;
		HSSFCell cell;
		for(int i = 0; i < rowDatas.size(); i++) {
			row = sheet.createRow(i);
			for(int j = 0; j < rowDatas.get(i).size(); j++) {
				cell = row.createCell(j);
				cell.setCellStyle(style);
				Object o = rowDatas.get(i).get(j);
				if(o instanceof Integer || o instanceof Double || o instanceof Float)
					cell.setCellValue(Double.parseDouble(""+o));
				else {
					cell.setCellValue(""+o);
				}
			}
		}
		if(outputType==-1) {
			try {
				FileOutputStream fout = new FileOutputStream("G:/one.xls");
				wb.write(fout);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}



	// MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://rm-2zee8n90w66h29ae3lo.mysql.rds.aliyuncs.com:3306/PatentPlatform?useUnicode=true&serverTimezone=GMT&characte&useSSL=false&allowMultiQueries=true";

	// MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
	//static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	//static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";


	// 数据库的用户名与密码，需要根据自己的设置
	static final String USER = "kaifaze";
	static final String PASS = "KAIfa123456";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try{
			// 注册 JDBC 驱动
			Class.forName(JDBC_DRIVER);

			// 打开链接
			System.out.println("连接数据库...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			// 执行查询
			System.out.println(" 实例化Statement对象...");
			stmt = conn.createStatement();
			String sql;
			sql = "select distinct p_patent_number ,p_type,p_agency_name,p_agency_num,p_applicants,p_agent_name from tb_patent where p_agency_num = '51264' order by p_patent_number";
			ResultSet rs = stmt.executeQuery(sql);
			List<List<Object>> datas = new ArrayList<>();
			List<List<Object>> datas1 = new ArrayList<>();
			List<String> patentNumbers = new ArrayList<>();
			// 展开结果集数据库
			while(rs.next()){
				List<Object> row = new ArrayList<>();
				// 通过字段检索
				String p_agency_name = rs.getString("p_agency_name");
				String p_agency_num = rs.getString("p_agency_num");
				String p_applicants = rs.getString("p_applicants");
				String p_agent_name = rs.getString("p_agent_name");
				String p_type = rs.getString("p_type");
				String p_patent_number = rs.getString("p_patent_number");
				row.add(p_agency_name);
				row.add(p_agency_num);
				row.add(p_applicants);
				row.add(p_agent_name);
				row.add(p_type);
				row.add(p_patent_number);
				patentNumbers.add(p_patent_number);
				datas.add(row);
			}
			System.out.println();
			StringBuilder stringBuilder = new StringBuilder();
			for(String s : patentNumbers){
				stringBuilder.append("or `申请号` = '"+s+"'");
			}
			System.out.println(stringBuilder.substring(2));
			sql = "select `申请号`,group_concat(`法律状态`) from cnlegalstatus_2015_2019 where "+stringBuilder.substring(2)+" group by `申请号` order by `申请号`";
			ResultSet rss = stmt.executeQuery(sql);
			HashMap r = new HashMap();
			while(rss.next()){
				r.put(rss.getString(1)+"", rss.getString(2));
			}
			for(int i = 0; i < datas.size(); i++){
			datas.get(i).add(r.get(patentNumbers.get(i))==null?"":r.get(patentNumbers.get(i)));
				System.out.println(datas.get(i).toString());
			}
			ToExcel(datas, -1);
			// 完成后关闭
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			// 处理 JDBC 错误
			se.printStackTrace();
		}catch(Exception e){
			// 处理 Class.forName 错误
			e.printStackTrace();
		}finally{
			// 关闭资源
			try{
				if(stmt!=null) stmt.close();
			}catch(SQLException se2){
			}// 什么都不做
			try{
				if(conn!=null) conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Goodbye!");
	}
}
