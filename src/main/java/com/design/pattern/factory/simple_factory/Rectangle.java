package com.design.pattern.factory.simple_factory;

import com.design.pattern.factory.simple_factory.intfa.Shape;

public class Rectangle implements Shape {

    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
