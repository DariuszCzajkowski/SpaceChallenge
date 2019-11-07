package com;


import java.util.ArrayList;
import java.util.Scanner;


public class Simulation {



    ArrayList<Item> itemList;
   public void loadItems(Scanner scanner)  {
            itemList =new ArrayList<>();
       //save in array each movie title
       while (scanner.hasNextLine()) {
           String textLine = scanner.nextLine();
           String[] listItems = textLine.split("=");
           Item item = new Item(listItems[0], Integer.parseInt(listItems[1]));
           itemList.add(item);


                  }

            scanner.close();
        }
        public void  loadU1(Scanner scanner){
                    //create new Array
                ArrayList<Rocket> rocketProjectU1 = new ArrayList<>();

               Rocket u1 = initRocketU1();
               //  counter of rockets
            int index = 0;

            // go through the itemList array
            for (Item holdItemList : itemList) {


                if (!u1.canCarry(holdItemList)) {
                    rocketProjectU1.add(u1);
                    u1 = initRocketU1();
                    index++;

                }
             u1.carry(holdItemList);

            }

           rocketProjectU1.add(u1);
            index++;


            System.out.println("\n Starting project launch with " + index + " rockets");
            // launch rocket
            runSimulation(rocketProjectU1);






        }
    public void  loadU2(Scanner scanner) {
        //create new Array
        ArrayList<Rocket> rocketProjectU2 = new ArrayList<>();

        Rocket u1 = initRocketU2();
        //  counter of rockets
        int index = 0;

        // go through the itemList array
        for (Item holdItemList : itemList) {


            if (!u1.canCarry(holdItemList)) {
                rocketProjectU2.add(u1);
                u1 = initRocketU2();
                index++;

            }
            u1.carry(holdItemList);

        }

        rocketProjectU2.add(u1);
        index++;


        System.out.println("\n Starting project launch with " + index + " rockets");
        // launch rocket
        runSimulation(rocketProjectU2);


    }

    private Rocket initRocketU2() {return new U2();
    }


    private int runSimulation(ArrayList<Rocket> rockets){
        int budget = 0;
        int index = 0;

        // go through the array of rockets
        for (Rocket aRocket: rockets) {
            budget = budget + aRocket.rocketCost;
            index++;
            System.out.println("Current budget is: " + budget);
            // if the rocket crashes when it launches or when it lands, send rocket again
            if (!aRocket.launch()){
                budget = budget + aRocket.rocketCost;
                System.out.println("launch fail, Rocket " + index + " explode"+ "\n Current budget is: " + budget
                        + " Relaunching rocket.");
                aRocket.launch();
            }else if (!aRocket.land()){
                budget = budget + aRocket.rocketCost;
                System.out.println("Rocket " + index + " crashed on landing." + " \n Current budget is: " + budget
                        + " Relaunching rocket.");
                aRocket.launch();
            }

            System.out.println("Rocket " + index + " arrived safely");

        }

        System.out.println("Total project budget = " + budget+"\n");
        return budget;
    }


    private Rocket initRocketU1() {
    return new U1();}


}


