package com;

public class U2 extends Rocket {

    U2() {
        rocketCost = 120000000;// $120 millions
        cargoLimit = 11000;  // max weight with the cargo 29ton
        // chance of explode launch  5% * (cargo carried / cargo limit)
        // chance of explode landing   1% * (cargo carried / cargo limit)
    }

    private double numberRandom (){

        double randomNumber= Math.random()*100;
    return randomNumber;
    }





        @Override
    public   boolean launch() {
            double launchChance=(currentWeight / cargoLimit)*4;
        return launchChance <= numberRandom();

    }

    @Override
    public boolean land() {  double landChance= (currentWeight / cargoLimit)*8;

        return landChance <= numberRandom();
    }
}



