package com.techelevator.view;

import java.util.Map;
import java.util.Scanner;

public class MoneyHandler {
    static double quarter = 0.25;
    static double dime = 0.10;
    static double nickel = 0.05;
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

    public static void selectProduct(Map<String, Items> map) {
        System.out.println("Please select your product");
        selectedItem = (scanner.nextLine());

         Items currentItem = map.get(selectedItem.toUpperCase());

        //check for stock
        if(currentItem.getStock() > 0 && balance >= (currentItem.getPrice())){
            currentItem.setStock(currentItem.getStock()-1);
            balance -= currentItem.getPrice();
            System.out.println("Money remaining: " + balance);
            System.out.println();
            if()


        }
        if(currentItem.getStock() == 0 ){
            System.out.println("This item sold out");
        }
        if(balance < (currentItem.getPrice())){
            System.out.println("Not enough money, please insert more money");

        }

            //check for balance
        System.out.println(map.get(selectedItem.toUpperCase()));

    }


        public static int[] getChange() {
            int[] coins = {5, 10, 25};
            int[] change = new int[3];
            for (int i = coins.length - 1; i >= 0; i--) {
                while (balance >= coins[i]) {
                    change[i] = change[i] + 1;
                    balance = balance - coins[i];
                    System.out.println(balance);
                    System.out.println(change);
                    System.out.println(coins);
                }
            }
            return change;

        }
            }











