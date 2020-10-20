package com.example.demo.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

//post body 参数少 空构造 setget 成功
//post body 参数少 全构造 setget 失败
//post body 参数少 空构造        失败
//post body 参数少 全构造        失败
//post body 参数多 空构造 setget 成功
//post body 参数多 全构造 setget 成功
//post body 参数多 全构造        成功
//post body 参数多 空构造        失败

//@Data
@AllArgsConstructor
public class TestDTO {
    private Integer id;

    @Override
    public String toString() {
        return "TestDTO{" +
                "id=" + id +
                '}';
    }
}
