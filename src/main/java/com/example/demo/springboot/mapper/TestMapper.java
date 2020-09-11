package com.example.demo.springboot.mapper;


import com.example.demo.springboot.entity.TbUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper {
    //新增普通用户
    Integer insertUser(TbUser tbUser);
    //查询普通用户
    TbUser selectUserByAccount(@Param("account") String account,@Param("rand")String rand);
    List<TbUser> selectUserByAccount1(@Param("account") String account, @Param("rand")String rand);
    Integer updateUserNickname(@Param("account")String account, @Param("nickname")String nickname);
}
