package com.example.demo.function;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestExcel1 {

    public static void main(String args[]) {
        try {
            //创建工作簿
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream("G:\\1.xlsx"));
            System.out.println("xssfWorkbook对象：" + xssfWorkbook);
            //读取第一个工作表(这里的下标与list一样的，从0开始取，之后的也是如此)
            XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
            System.out.println("sheet对象：" + sheet);
            //获取第一行的数据
            XSSFRow row = sheet.getRow(0);
            System.out.println("row对象：" + row);
            //获取该行第一个单元格的数据
            XSSFCell cell0 = row.getCell(0);
            System.out.println("cello对象：" + cell0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
