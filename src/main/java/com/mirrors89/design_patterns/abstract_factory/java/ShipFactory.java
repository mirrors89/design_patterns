package com.mirrors89.design_patterns.abstract_factory.java;

import com.mirrors89.design_patterns.factorymethod.after.Ship;
import com.mirrors89.design_patterns.factorymethod.after.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
