package com.mirrors89.design_patterns.factorymethod.after;

public class BlackShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
