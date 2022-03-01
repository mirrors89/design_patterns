package com.mirrors89.design_patterns.factorymethod.java;

import com.mirrors89.design_patterns.factorymethod.after.BlackShip;
import com.mirrors89.design_patterns.factorymethod.after.WhiteShip;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
