package com.design.pattern.factory.factory_method;

import com.design.pattern.factory.astract_factory.AbstractFactory;
import com.design.pattern.factory.factory_method.intf.Color;
import com.design.pattern.factory.simple_factory.intfa.Shape;

public class AbstactFactoryDemo {


    public static void main(String [] args){
        AbstractFactory shapeAbstractFactory = FactoryProducer.getFacotry("shape");
        Shape circle = shapeAbstractFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectange = shapeAbstractFactory.getShape("RECTANGLE");
        rectange.draw();

        Shape square = shapeAbstractFactory.getShape("SQUARE");
        square.draw();

        AbstractFactory abstractFactory = FactoryProducer.getFacotry("color");
        Color color = abstractFactory.getColor("red");
        color.fill();;

        Color colorBlue = abstractFactory.getColor("blue");
        colorBlue.fill();
    }
}
