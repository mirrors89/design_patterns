package com.mirrors89.design_patterns.factorymethod.after;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
