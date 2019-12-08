package com.design.pattern.factory.factory_method;

import com.design.pattern.factory.astract_factory.AbstractFactory;
import com.design.pattern.factory.factory_method.impl.Blue;
import com.design.pattern.factory.factory_method.impl.Red;
import com.design.pattern.factory.factory_method.intf.Color;
import com.design.pattern.factory.simple_factory.intfa.Shape;

public class ColorFactory extends AbstractFactory {


    public Color getColor(String colorType){
        if (colorType == null ) return null;

        if(colorType.equalsIgnoreCase("blue")){
            return new Blue();

        }else if(colorType.equalsIgnoreCase("red")){
            return new Red();
        }
        return null;
    }

    public Shape getShape(String shapetype) {
        return null;
    }
}
