package com.design.pattern.build.builder;

import com.design.pattern.build.productentity.Father;
import com.design.pattern.build.productentity.Student;

/**
 * 构建器
 */
public class StudentBuilder {

    private Student student = new Student();

    public StudentBuilder id(int id){
        student.setId(id);
        return this;
    }

    public StudentBuilder name(String name){
        student.setName(name);
        return this;
    }

    public StudentBuilder age(int age){
        student.setAge(age);
        return this;
    }

    public StudentBuilder father(String fatherName){
        Father father = new Father();
        father.setName(fatherName);
        student.setFather(father);
        return this;
    }

    public Student build(){
        return student;
    }
}
