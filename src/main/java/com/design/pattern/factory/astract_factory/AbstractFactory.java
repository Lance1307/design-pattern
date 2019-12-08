package com.design.pattern.factory.astract_factory;

import com.design.pattern.factory.factory_method.intf.Color;
import com.design.pattern.factory.simple_factory.intfa.Shape;

public abstract class AbstractFactory {


    public abstract Color getColor(String colorType);

    public abstract Shape getShape(String shapetype);
}
