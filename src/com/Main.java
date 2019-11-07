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


       simulation.loadItems(phaseOne);
        System.out.println("Loading rocket U1 phase-1");
        simulation.loadU1(phaseOne);
        System.out.println("Loading rocket U2 phase-2");
        simulation.loadU2(phaseOne);
       //scan phase-2 text
        Scanner phaseTwo = null;
        try {
            phaseTwo = new Scanner(new File("src/com/phase-2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Loading U1 rocket phase-2");
        simulation.loadItems(phaseTwo);

        simulation.loadU1(phaseTwo);
        System.out.println("Loading U2 rocket phase-2");
        simulation.loadU2(phaseTwo);


      //
     //










    }

}