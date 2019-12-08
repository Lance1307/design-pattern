package com.design.pattern.factory.simple_factory;

import com.design.pattern.factory.simple_factory.intfa.Shape;

public class FactoryDemo {

    public static void main(String [] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        // 通过工厂类型，获取指定类型的对象
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectange = shapeFactory.getShape("RECTANGLE");
        rectange.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
