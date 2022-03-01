package com.mirrors89.design_patterns.factorymethod.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        client.print(new WhiteShipFactory(), "Whiteship", "lee01494@gmai.com");
        client.print(new BlackShipFactory(), "Blackship", "lee01494@gmai.com");
    }


    private void print(ShipFactory factory, String name, String email) {
        System.out.println(factory.orderShip(name, email));
    }
}
