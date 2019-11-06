package com;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        // write your code here
        // scan Phase One Text
        Scanner phaseOne = null;
        try {
            phaseOne = new Scanner(new File("phase-1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(phaseOne);
    }


}