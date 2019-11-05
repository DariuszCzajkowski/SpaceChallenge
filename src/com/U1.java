package com;

public class U1 extends Rocket{

    int RocketCost= 100000000;// $100 millions
    int rocketWeight= 10000; // 10ton in kg
    int maxWeight= 18000;  // max weight with the cargo
    // chance of explode launch  5% * (cargo carried / cargo limit)
    // chance of explode landing   1% * (cargo carried / cargo limit)

    double carry
    double randomNumber= Math.random();
    double launchChance=0.05*(carry/maxWeight);
    double landChance=0.01*(carry/maxWeight);





   public   boolean launch() {

        return launchChance >= randomNumber;

    }

    @Override
    public boolean land() {
        return ;
    }
}
