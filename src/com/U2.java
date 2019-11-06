package com;

public class U2 extends Rocket {
    int RocketCost= 120000000;// $120 millions
    int cargoLimit= 11000;  // max weight with the cargo 29ton
    // chance of explode launch  5% * (cargo carried / cargo limit)
    // chance of explode landing   1% * (cargo carried / cargo limit)


    private double randomNumber= Math.random();
    double launchChance=0.04*(currentWeight / maxWeight);
    double landChance=0.08*(currentWeight / maxWeight);





    public   boolean launch() {

        return launchChance >= randomNumber;

    }

    @Override
    public boolean land() {
        return landChance >= randomNumber;
    }
}



