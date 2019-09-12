package com.design.pattern.build;

import com.alibaba.fastjson.JSON;
import com.design.pattern.build.builder.StudentBuilder;
import com.design.pattern.build.productentity.Student;

/**
 * 构建者模式
 * 通过多个简单的对象一步步创建一个复杂的对象
 * 一个builder会构建一个最终的对象，并且该builder类是独立于其他对象存在的
 * 意图：将一个复杂的构建和其表示相分离，使其同样的构建过程可以创建不同的表示
 *
 * 如StringBuilder
 * 优点是：
 *  1，构建者独立，易扩展
 *  2，便于控制细节风险
 * 缺点是：
 *  1，产品必须有共同点，范围有限制
 *  2，如内部变化复杂，会有很多的构建类
 *
 * 使用场景：
 *   1，需要生产的对象具有复杂的内部结构
 *   2，需要生产的对象内部属性本身相互依赖
 *
 *  注意事项
 *      与工厂模式的区别是：构建者模式更加关注与零件装配的顺序
 *
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
