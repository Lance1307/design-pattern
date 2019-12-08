package com.design.pattern.factory.factory_method;

import com.design.pattern.factory.astract_factory.AbstractFactory;

public class FactoryProducer {


    public static AbstractFactory getFacotry(String choice){
        if(choice == null) return null;

        if(choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }else if(choice.equalsIgnoreCase("shape")){
            return new Shape2Factory();
        }
        return null;
    }
}
