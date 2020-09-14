package com.example.demo.function;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: zjk
 * @Date: 2019/8/30
 * @Description:
 */
public class TestExcel2 {
    public static void main(String[] args) {
        try {
            //创建工作簿
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream("G:\\1.xlsx"));
            //读取第一个工作表
            XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
            //获取最后一行的num，即总行数。此处从0开始计数
            int maxRow = sheet.getLastRowNum();
            System.out.println(maxRow);
            List<String>sqls = new ArrayList<>(200);
            int layer3=10000;
            for (int row = 1; row <= maxRow; row++) {
                Integer code = Integer.parseInt(("" + sheet.getRow(row).getCell(0)).replace(".0", ""));
                String name = "" + sheet.getRow(row).getCell(1);
                if(code == 7 || code == 8 || code ==9 || code ==10){
                    sqls.add(getSql(code,code+"", name, 0, 1));
                }else if(code > 700 && code < 2000){
                    String str[] = ("" + sheet.getRow(row).getCell(4)).split("；");
                    sqls.add(getSql(code,code+"", name, (int)code/100, 2));
                    if(str.length!=0){
                        for(int i = 0; i < str.length; i++){
                            if(str[i] != null && !"".equals(str[i]) && !"null".equals(str[i])){
                                String str1[] = str[i].split(" ");
                                System.out.println(str1[0]+" "+str1[1]);
                                sqls.add(getSql(layer3++,str1[0], str1[1], code, 3));
                            }
                        }
                    }
                }
            }
            File file = new File("G://1.sql");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            for(int i = 0; i < sqls.size(); i++){
                fileOutputStream.write((sqls.get(i)+";\n").getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String getSql(int id, String code,String name, int pid, int layer){
        StringBuilder stringBuilder = new StringBuilder("insert into tb_neighbourhood value("+id+",'"+code+"', '"+name+"', "+pid+", "+layer+")");
        return stringBuilder.toString();
    }
}
