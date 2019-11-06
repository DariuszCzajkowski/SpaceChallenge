package com;


import java.util.ArrayList;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Simulation {



    ArrayList<Item> loadingList;
   public void loadItems(Scanner scanner) throws FileNotFoundException {
            loadingList =new ArrayList<>();
       //save in array each movie title
       while (scanner.hasNextLine()) {
           String lineString = scanner.nextLine();
           String[] listItems = lineString.split("=");
           Item item = new Item(listItems[0], Integer.parseInt(listItems[1]));
           loadingList.add(item);


                  }


        }


}
