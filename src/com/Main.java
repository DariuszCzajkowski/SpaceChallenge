package com;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        // write your code here
        // scan Phase-1 Text

        Simulation simulation= new Simulation();
        Scanner phaseOne = null;
        try {
            phaseOne = new Scanner(new File("src/com/phase-1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //scan phase-2 text
        Scanner phaseTwo = null;
        try {
            phaseTwo = new Scanner(new File("src/com/phase-2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


       simulation.loadItems(phaseOne);
       simulation.loadItems(phaseTwo);
        simulation.loadU1(phaseOne);
        simulation.loadU1(phaseTwo);




        simulation.loadU2(phaseOne);
        simulation.loadU2(phaseTwo);










    }

}