package com.techelevator.view;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;



public class MoneyHandler {
    private static final BigDecimal QUARTER = new BigDecimal(".25");
    private static final BigDecimal DIME = new BigDecimal(".10");
    private static final BigDecimal NICKEL = new BigDecimal(".05");
    static double balance = 0;
    static double inputMoney = 0;
    static String selectedItem;
    double priceOfItem; //Pulled from map
//    double price = MakingItemsToMap.item([3])

    MakingItemsToMap mapHolder = new MakingItemsToMap();

    Map<String, Items> map = (Map<String, Items>) mapHolder;

    static Scanner scanner = new Scanner(System.in);

    public static void feedMoney() {
        System.out.println("Please enter money");
        inputMoney = Double.parseDouble(scanner.nextLine());
        balance += inputMoney;
        System.out.println("Your balance is: " + balance);

    }

    public static void selectProduct(Map<String, Items> map) throws FileNotFoundException {

        Map<String, Items> Inventory = MakingItemsToMap.startUp();

        for (Map.Entry<String, Items> item : Inventory.entrySet()) {
            System.out.println(item.getValue());
        }
        System.out.println();
        System.out.println("Please select your product");
        System.out.println();
        selectedItem = (scanner.nextLine());


        Items currentItem = map.get(selectedItem.toUpperCase());


        //check for stock
        if (currentItem.getStock() > 0 && balance >= (currentItem.getPrice())) {
            currentItem.setStock(currentItem.getStock() - 1);
            balance -= currentItem.getPrice();
            System.out.println();
            System.out.println("Money remaining: " + balance);
            System.out.println();
            System.out.println("Enjoy your purchase");
            if (currentItem.getTypeOfItem().equals("Candy")) {
                System.out.println("Munch Munch, Mmm Mmm Good!");
            }
            if (currentItem.getTypeOfItem().equals("Chips")) {
                System.out.println("Crunch Crunch, It's Yummy!");
            }
            if (currentItem.getTypeOfItem().equals("Gum")) {
                System.out.println("Chew Chew, Pop!");
            }
            if (currentItem.getTypeOfItem().equals("Drink")) {
                System.out.println("Glug Glug, Chug Chug!");
            }
            System.out.println();


        }
        if (currentItem.getStock() == 0) {
            System.out.println();
            System.out.println("This item sold out");
            System.out.println();
        }
        if (balance < (currentItem.getPrice())) {
            System.out.println();
            System.out.println("Not enough money, please insert more money");
            System.out.println();

        }

        //check for balance
        System.out.println(map.get(selectedItem.toUpperCase()));

    }


    public static BigDecimal[] getChange() {



        BigDecimal amount = new BigDecimal(balance);
        BigDecimal change = amount.multiply(new BigDecimal("100"));
        BigDecimal quarters = change.divide(QUARTER.multiply(new BigDecimal("100")), 0, RoundingMode.FLOOR);
        change = change.subtract(QUARTER.multiply(new BigDecimal("100")).multiply(quarters));
        BigDecimal dimes = change.divide(DIME.multiply(new BigDecimal("100")), 0, RoundingMode.FLOOR);
        change = change.subtract(DIME.multiply(new BigDecimal("100")).multiply(dimes));
        BigDecimal nickels = change.divide(NICKEL.multiply(new BigDecimal("100")), 0, RoundingMode.FLOOR);

        System.out.println();
        System.out.print("Your change is: ");
        System.out.print("Quarters: " + quarters + " ");
        System.out.print("Dimes: " + dimes+ " ");
        System.out.print("Nickels: " + nickels);
        System.out.println();

        return new BigDecimal[]{};
    }

}










