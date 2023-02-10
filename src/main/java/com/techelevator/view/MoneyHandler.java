package com.techelevator.view;

import java.io.InputStream;
import java.util.Arrays;
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
        System.out.println("Give me cash");
        inputMoney = Double.parseDouble(scanner.nextLine());
        balance += inputMoney;
        System.out.println("Your balance is: " + balance);

    }

    public static void selectProduct(Map<String, Items> map) {
        System.out.println("Please select your product");
        selectedItem = (scanner.nextLine());

         Items currentItem = map.get(selectedItem.toUpperCase());

        //check for stock
        if(currentItem.getStock() > 0 ){
            currentItem.setStock(currentItem.getStock()-1);
            balance -= currentItem.getPrice();
            System.out.println(balance);
        }




            //check for balance
        System.out.println(map.get(selectedItem.toUpperCase()));

    }




//        if(system.in = map.containskey(userinput)){
//            price = map.priceOfItem
//        }
//    }
//    public static void selectProduct(Items ) {
//        if(MakingItemsToMap.item() > balance){
//            System.out.println("You're poor");
//        }else{
//            stockOfItem -= 1;
//            balance -= priceOfItem;
//        }}
//



//
//    public static double finishTransaction() {
//        if (balance > 0) {
//            return balance;
//        }
//        return balance;
//    }
//
//    public static double[] makeChange(double change, double[] denominations) {
//        denominations = new double[]{quarter, nickel, dime};
//        double[] result = new double[denominations.length];
//        Arrays.sort(denominations);
//        for (int i = denominations.length - 1; i >= 0; i--) {
//            while (change >= denominations[i]) {
//                change -= denominations[i];
//                result[i]++;
//
//            }
//            return result;
//        }return result;
//
//
//        }
//
//        //If money inserted update balance
//
//
//
//    public void purchaseItem(Items item) {
//        if (balance >= item.getPrice()) {
//            //dispense item
//            balance = balance - item.getPrice();
//        }
//    }
//    /*public Double returnBalance() {
//        if (balance >= 0.25) {
//
//        }*/


}







