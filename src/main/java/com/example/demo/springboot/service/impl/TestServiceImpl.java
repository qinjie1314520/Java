package com.example.demo.springboot.service.impl;


import com.example.demo.springboot.controller.TestController;
import com.example.demo.springboot.entity.TbUser;
import com.example.demo.springboot.mapper.TestMapper;
import com.example.demo.springboot.service.TestService;
import com.example.demo.springboot.cglib代理.Timer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.*;
import java.util.HashMap;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestMapper userLoginDao;



    @Override
    public Object test() {

        //测试事务的隔离级别
        TbUser user = new TbUser();
        user.setUAccount("123456789");
        user.setUNickname("秦杰");
        user.setUCreateTime(new Date(System.currentTimeMillis()));
        userLoginDao.insertUser(user);
        return "1";
    }

    //脏读
    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Object test1() {
        String rand = (int) Math.random() * 1000 + "";

        System.out.println(userLoginDao.selectUserByAccount("123456789",rand));
        System.out.println(userLoginDao.selectUserByAccount("123456789",rand).getUNickname());
        return "";
    }

    //脏读
    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Object test1_1() {String rand = (int) Math.random() * 1000 + "";

        System.out.println("开始更新");
        System.out.println("开始更新前"+userLoginDao.selectUserByAccount("123456789",rand).getUNickname());
        Integer re = userLoginDao.updateUserNickname("123456789", "游戏");
        System.out.println("开始更新后"+userLoginDao.selectUserByAccount("123456789",rand).getUNickname());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int i = 1/0;
        return re;
    }


    //不可重复读,可能存在缓存，但是数据库已经更改
    @Override
    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public Object test2() throws Exception {
        String rand = (int) Math.random() * 1000 + "";
        selectNickname();
        System.out.println("前："+userLoginDao.selectUserByAccount("123456789",rand).getUNickname());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("后："+userLoginDao.selectUserByAccount("123456789",rand).getUNickname());
        selectNickname();
        return null;
    }
    //不可重复读
    @Override
    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public Object test2_1() {

        return userLoginDao.updateUserNickname("123456789", "测试不可重复读");
    }


    //可重复读
    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Object test3() throws Exception {
        String rand = (int) Math.random() * 1000 + "";
        selectNickname();
        System.out.println("前："+userLoginDao.selectUserByAccount("123456789",rand).getUNickname());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("后："+userLoginDao.selectUserByAccount("123456789",rand).getUNickname());
        selectNickname();
        return userLoginDao.selectUserByAccount("123456789",rand).getUNickname();
    }
    //可重复读
    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Object test3_1() {
        return userLoginDao.updateUserNickname("123456789", "测试可重复读");
    }


    //幻读
    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Object test4() throws Exception {
        String rand = (int) Math.random() * 1000 + "";
        System.out.println("前："+userLoginDao.selectUserByAccount1("123456789",rand));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("后："+userLoginDao.selectUserByAccount1("123456789",rand));

        return 1;
    }

    //幻读
    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Object test4_1() {
        //测试事务的隔离级别
        TbUser user = new TbUser();
        user.setUAccount("123456789");
        user.setUNickname("秦杰");
        user.setUCreateTime(new Date(System.currentTimeMillis()));
        userLoginDao.insertUser(user);
        return 1;
    }
    public static void main(String args[]) throws Exception {
        selectNickname();
    }



    protected static void selectNickname() throws Exception {
        String URL = "jdbc:mysql://139.9.87.17:3306/campusshops?characterEncoding=UTF-8&allowMultiQueries=true";
        String USER = "campusshops";
       String PASSWORD = "campusshops";
        String DRIVER = "com.mysql.cj.jdbc.Driver";
        // 1.加载驱动程序
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        Class.forName(DRIVER);
        conn = DriverManager.getConnection(URL, USER, PASSWORD);

        String sql = "select u_nickname  from tb_user where u_account = 123456789";
        statement = conn.prepareStatement(sql);
//        statement.I
        rs = statement.executeQuery();
        // 4.处理数据库的返回结果(使用ResultSet类)

        HashMap applicationSupplier = new HashMap();
        while (rs.next()) {
            System.out.println(rs.getString("u_nickname"));
        }
        if(rs!=null)
            rs.close();
        if(statement!=null)
            statement.close();
        if(conn!=null) {
            conn.close();
        }
    }
    @Timer
    @Override
    public void aop(){
        System.out.println("aop");
    }

    @Override
    public void threadLocal() {
        System.out.println(TestController.threadLocal.get());
    }

}
