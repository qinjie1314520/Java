package com.example.demo.learn.jdbc;

import java.sql.*;

public class JDBC1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://139.9.87.17:3306/campusshops?useUnicode=true&serverTimezone=GMT&characte&useSSL=false&allowMultiQueries=true";
        String username = "campusshops";
        String password = "campusshops";



        //加载驱动
        Class.forName(driver);

        //建立连接
        Connection connection = DriverManager.getConnection(url,username,password);

        //创建statement对象执行sql
        String sql = "select * from tb_user";
        ResultSet resultSet = connection.createStatement().executeQuery(sql);
        while(resultSet.next()){
            System.out.println(resultSet.getString(1)+" : " +resultSet.getString(2));
        }
        //关闭连接
        resultSet.close();
        connection.close();

    }

}
