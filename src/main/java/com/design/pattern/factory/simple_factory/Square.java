package com.design.pattern.factory.simple_factory;

import com.design.pattern.factory.simple_factory.intfa.Shape;

public class Square  implements Shape {

    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
