package com.design.pattern.factory.factory_method;

import com.design.pattern.factory.astract_factory.AbstractFactory;
import com.design.pattern.factory.factory_method.intf.Color;
import com.design.pattern.factory.simple_factory.Circle;
import com.design.pattern.factory.simple_factory.Rectangle;
import com.design.pattern.factory.simple_factory.Square;
import com.design.pattern.factory.simple_factory.intfa.Shape;

public class Shape2Factory  extends AbstractFactory {


    public Color getColor(String colorType) {
        return null;
    }

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
