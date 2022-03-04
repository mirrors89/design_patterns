package com.mirrors89.design_patterns.abstract_factory.after;

import com.mirrors89.design_patterns.abstract_factory.before.WhiteAnchor;
import com.mirrors89.design_patterns.abstract_factory.before.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel() ;
    }
}
