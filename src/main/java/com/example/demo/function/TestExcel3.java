package com.example.demo.function;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: zjk
 * @Date: 2019/8/30
 * @Description:
 */
public class TestExcel3 {
    public static void main(String[] args) {
        try {
            //创建工作簿
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream("G:\\1.xlsx"));
            //读取第一个工作表
            XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
            //获取最后一行的num，即总行数。此处从0开始计数
            int maxRow = sheet.getLastRowNum();
            System.out.println(maxRow);
            for (int row = 1; row <= maxRow; row++) {
                //获取最后单元格num，即总单元格数 ***注意：此处从1开始计数***
                int maxRol = sheet.getRow(row).getLastCellNum();
                System.out.println("--------第" + row + "行的数据如下--------");
                System.out.println(maxRol);
                List<String> names = new ArrayList<String>(5);
                List<String> codes = new ArrayList<String>(5);
                for (int rol = 0; rol < maxRol; rol++){
                    if(rol+1 <  maxRol ){
                        String code = sheet.getRow(row).getCell(rol)+"";
                        String name = sheet.getRow(row).getCell(rol+1)+"";
                        if(!code.equals("null") && !name.equals("null")){
                            names.add(name.trim());
                            codes.add(code.trim());
                        }
                    }
                    System.out.print(sheet.getRow(row).getCell(rol) + ":");
                }
                System.out.println();
                for(int i = 0; i < names.size(); i++){
                    if(!"".equals(codes.get(i)) && !"".equals(names.get(i))){
                        System.out.println(codes.get(i)+" "+names.get(i));
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
