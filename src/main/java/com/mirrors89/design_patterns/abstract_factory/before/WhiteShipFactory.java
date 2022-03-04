package com.mirrors89.design_patterns.abstract_factory.before;


import com.mirrors89.design_patterns.factorymethod.after.DefaultShipFactory;
import com.mirrors89.design_patterns.factorymethod.after.Ship;
import com.mirrors89.design_patterns.factorymethod.after.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
