package com.mirrors89.design_patterns.abstract_factory.after;


import com.mirrors89.design_patterns.abstract_factory.before.WhiteAnchor;
import com.mirrors89.design_patterns.abstract_factory.before.WhiteWheel;
import com.mirrors89.design_patterns.factorymethod.after.DefaultShipFactory;
import com.mirrors89.design_patterns.factorymethod.after.Ship;
import com.mirrors89.design_patterns.factorymethod.after.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
