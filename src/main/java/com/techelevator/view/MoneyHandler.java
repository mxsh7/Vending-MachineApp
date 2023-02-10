package com.techelevator.view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;


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
        out.println("Please enter money");
        inputMoney = Double.parseDouble(scanner.nextLine());
        balance += inputMoney;
        out.println("Your balance is: " + balance);

    }

    public static void selectProduct(Map<String, Items> map) throws FileNotFoundException {

        Map<String, Items> Inventory = MakingItemsToMap.startUp();

        try {


            /*for (Map.Entry<String, Items> startUp : Inventory.entrySet()) {
                out.println(startUp.getValue());
            }*/
            out.println();
            out.println("Please select your product");
            out.println();
            selectedItem = (scanner.nextLine());



        /*if(map.get(selectedItem.toUpperCase()) == null){

            out.println(System.lineSeparator() + "*** " + selectedItem + " is not a valid option ***" + System.lineSeparator());
        }*/


            Items currentItem = map.get(selectedItem.toUpperCase());


            //check for stock
            if (currentItem.getStock() > 0 && balance >= (currentItem.getPrice())) {
                currentItem.setStock(currentItem.getStock() - 1);
                balance -= currentItem.getPrice();
                out.println();
                out.println("Money remaining: " + balance);
                out.println();
                out.println("Enjoy your purchase");
                if (currentItem.getTypeOfItem().equals("Candy")) {
                    out.println("Munch Munch, Mmm Mmm Good!");
                }
                if (currentItem.getTypeOfItem().equals("Chips")) {
                    out.println("Crunch Crunch, It's Yummy!");
                }
                if (currentItem.getTypeOfItem().equals("Gum")) {
                    out.println("Chew Chew, Pop!");
                }
                if (currentItem.getTypeOfItem().equals("Drink")) {
                    out.println("Glug Glug, Chug Chug!");
                }
                out.println();


            }
            if (currentItem.getStock() == 0) {
                out.println();
                out.println("This item sold out");
                out.println();
            }
            if (balance < (currentItem.getPrice())) {
                out.println();
                out.println("Not enough money, please insert more money");
                out.println();

            }

            //check for balance
            out.println(map.get(selectedItem.toUpperCase()));

        }catch(Exception ex){
            out.println("Invalid input");
        }

    }
    public static BigDecimal[] getChange() {



        BigDecimal amount = new BigDecimal(balance);
        BigDecimal change = amount.multiply(new BigDecimal("100"));
        BigDecimal quarters = change.divide(QUARTER.multiply(new BigDecimal("100")), 0, RoundingMode.FLOOR);
        change = change.subtract(QUARTER.multiply(new BigDecimal("100")).multiply(quarters));
        BigDecimal dimes = change.divide(DIME.multiply(new BigDecimal("100")), 0, RoundingMode.FLOOR);
        change = change.subtract(DIME.multiply(new BigDecimal("100")).multiply(dimes));
        BigDecimal nickels = change.divide(NICKEL.multiply(new BigDecimal("100")), 0, RoundingMode.FLOOR);

        out.println();
        out.print("Your change is: ");
        out.print("Quarters: " + quarters + " ");
        out.print("Dimes: " + dimes+ " ");
        out.print("Nickels: " + nickels);
        out.println();

        return new BigDecimal[]{};
    }

}










