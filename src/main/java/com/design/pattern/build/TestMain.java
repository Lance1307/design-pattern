package com.design.pattern.build;

import com.alibaba.fastjson.JSON;
import com.design.pattern.build.builder.StudentBuilder;
import com.design.pattern.build.productentity.Student;

/**
 * 构建者模式
 */
public class TestMain {


    public static void main(String [] args){
        StudentBuilder builder = new StudentBuilder();
        Student student = builder.id(1).name("lance").age(30).father("LCJ").build();

        System.out.println(JSON.toJSONString(student));
        System.out.println("***************************************");
        System.out.println(student.toString());
        }
        }
