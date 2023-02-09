package com.techelevator.view;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakingItemsToMap {
    public static void main(String[] args) throws FileNotFoundException {


    }

    public static Map<String, Items> startUp() throws FileNotFoundException {
        Map<String, Items> map = new HashMap<>();
        try (Scanner scanner = new Scanner(new File("C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-4\\vendingmachine.csv"))) {
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String locator = "";
                String nameOfItem = "";
                double price = 0;
                String typeOfItem = "";

                String[] words = line.split("\\|");
                locator = words[0];
                nameOfItem = words[1];
                price = Double.parseDouble(words[2]);
                typeOfItem = words[3];


                map.put(words[0], new Items(locator, nameOfItem, price, typeOfItem, 5));

                String theNameOfItem = nameOfItem;
                String locationOfItem = locator;
                double priceOfItem = price;
            }
            return map;
        }

    }

    public static void item() throws FileNotFoundException {

        try (Scanner scanner = new Scanner(new File("C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-4\\vendingmachine.csv"))) {
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String locator = "";
                String nameOfItem = "";
                double price = 0;
                String typeOfItem = "";

                String[] words = line.split("\\|");
                locator = words[0];
                nameOfItem = words[1];
                price = Double.parseDouble(words[2]);
                typeOfItem = words[3];

                Map<String, Items> map = new HashMap<>();
                map.put(words[0], new Items(locator, nameOfItem, price, typeOfItem));

                //System.out.println(map);
                String theNameOfItem = nameOfItem;
                String locationOfItem = locator;
                double priceOfItem = price;

                System.out.println(locationOfItem + " " + theNameOfItem + " costs: " + priceOfItem);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}





/*                        map.put("nameOfItem", new Items(words[1]);
                        map.put("price", new Items(words[2]);
                        map.put("typeOfItem", new Items(words[3]);*/


 /* String[] words = line.split("\\|");
                for (String word : words) {*/


        /*File inputFile = new File("C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-4\\vendingmachine.csv");
        Scanner scanner = new Scanner(inputFile);
        String lineFromFile = scanner.nextLine();
        String pole = "|";
        String itemFromLine = "";
        try(lineFromFile(String[] itemFromLine = lineFromFile.split(pole){
            while (itemFromLine != null) {
                System.out.println();
            }
        }
        catch (IOException e) {
            System.out.println("File Read Error");
        }*/

        /*Map<String, Items> items = new HashMap();
        items.put(1, new Item(lineFromFile) );
*/


