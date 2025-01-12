package com.example.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.entity.Student;

/**
 * @author AthenaKnovesp
 */
public interface StudentMapper extends BaseMapper<Student> {

    /*
     可添加自定义的接口方法
     注解方式
        @Select("select * from user")
        public List<User> findAll();
    */


}
