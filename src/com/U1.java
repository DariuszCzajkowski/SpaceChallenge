package com;

public class U1 extends Rocket{
   U1() {
       rocketCost = 100000000;// $100 millions

        cargoLimit = 8000;  // max weight with the cargo
        // chance of explode launch  5% * (cargo carried / cargo limit)
        // chance of explode landing   1% * (cargo carried / cargo limit)

    }
    private double numberRandom (){

        double randomNumber= Math.random()*100;
        return randomNumber;
    }




    @Override
   public   boolean launch() {
        double launchChance = (currentWeight / cargoLimit) * 5;
        return (launchChance <= numberRandom());

    }

    @Override
    public boolean land() {
        double landChance = currentWeight / cargoLimit ;


        return (landChance <= numberRandom());
    }
}
