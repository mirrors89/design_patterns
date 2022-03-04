package com.mirrors89.design_patterns.abstract_factory.after;

import com.mirrors89.design_patterns.factorymethod.after.Ship;

public class ShipInventory {

    public static void main(String[] args) {
        WhiteShipFactory whiteShipFactory = new WhiteShipFactory(new WhiteShipProPartsFactory());

        Ship ship = whiteShipFactory.createShip();
        System.out.println(ship);
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
