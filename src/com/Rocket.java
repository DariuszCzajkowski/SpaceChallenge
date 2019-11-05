package com;

public class Rocket implements SpaceShip {


    @Override
    public boolean launch() {


        return false;
    }

    @Override
    public boolean land() {
        return false;
    }


    public boolean canCarry() {


        return false;
    }

    @Override
    public int carry() {
        return 0;
    }
}
