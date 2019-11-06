package com;

public class Rocket implements SpaceShip {

    int rocketCost;
    int currentWeight;
    double cargoLimit;
    @Override
    public  boolean launch() { return true;   }

    @Override
    public boolean land() {
        return true;
    }



    @Override
    public int carry(Item item) {
         currentWeight=currentWeight+item.weight;

        return currentWeight;
    }
    @Override
    public boolean canCarry(Item item) {

        return  (currentWeight+item.weight)<=cargoLimit;

}}
