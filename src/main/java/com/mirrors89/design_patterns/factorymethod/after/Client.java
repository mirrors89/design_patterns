package com.mirrors89.design_patterns.factorymethod.after;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "lee01494@gmai.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "lee01494@gmai.com");
        System.out.println(blackship);

    }

}
