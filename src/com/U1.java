package com;

public class U1 extends Rocket{
   U1() {
       rocketCost = 100000000;// $100 millions

        cargoLimit = 8000;  // max weight with the cargo
        // chance of explode launch  5% * (cargo carried / cargo limit)
        // chance of explode landing   1% * (cargo carried / cargo limit)

    }
        double randomNumber = (Math.random()*100)+1;




    @Override
   public   boolean launch() {
        double launchChance = (currentWeight / cargoLimit) * 5;
        return (launchChance <= randomNumber);

    }

    @Override
    public boolean land() {
        double landChance = (currentWeight / cargoLimit)+1 ;


        return (landChance <= randomNumber);
    }
}
