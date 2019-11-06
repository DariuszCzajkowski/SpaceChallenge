package com;

public class U1 extends Rocket{

    int RocketCost= 100000000;// $100 millions

    double cargoLimit= 8000;  // max weight with the cargo
    // chance of explode launch  5% * (cargo carried / cargo limit)
    // chance of explode landing   1% * (cargo carried / cargo limit)


    private double randomNumber= Math.random();
    double launchChance=0.05*(currentWeight / cargoLimit);
    double landChance=0.01*(currentWeight / cargoLimit);




    @Override
   public   boolean launch() {

        return launchChance >= randomNumber;

    }

    @Override
    public boolean land() {
        return landChance >= randomNumber;
    }
}
