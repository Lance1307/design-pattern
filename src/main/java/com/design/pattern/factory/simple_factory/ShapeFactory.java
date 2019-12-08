package com.design.pattern.factory.simple_factory;

import com.design.pattern.factory.simple_factory.intfa.Shape;

public class ShapeFactory {

    //使用该方法，获取形状类型的对象
    public Shape getShape(String shapetype){
        if (shapetype==null) return null;

        if(shapetype.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapetype.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapetype.equalsIgnoreCase("SQUARE")){
            return new Square();
        }


        return null;
    }

}
