package com;

public class U2 extends Rocket {

    U2() {
        rocketCost = 120000000;// $120 millions
        cargoLimit = 11000;  // max weight with the cargo 29ton
        // chance of explode launch  5% * (cargo carried / cargo limit)
        // chance of explode landing   1% * (cargo carried / cargo limit)
    }

    private double randomNumber= Math.random();
    double launchChance=4*(currentWeight / cargoLimit);
    double landChance=8*(currentWeight / cargoLimit);




        @Override
    public   boolean launch() {

        return launchChance >= randomNumber;

    }

    @Override
    public boolean land() {
        return landChance >= randomNumber;
    }
}



