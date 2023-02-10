package com.techelevator.view;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class MoneyHandler {
    static double quarter = 0.25;
    static double dime = 0.10;
    static double nickel = 0.05;
    static double balance = 0;
    static double inputMoney = 0;
    double priceOfItem; //Pulled from map
    /*double price = MakingItemsToMap.item([3])*/

    MakingItemsToMap mapHolder = new MakingItemsToMap();
    Map<String, Items> map = (Map<String, Items>) mapHolder;


    public static void feedMoney() {
        balance += inputMoney;
    }
    /*public static void selectProduct(Items item) {
        if(MakingItemsToMap.item(price)) > balance){
            System.out.println("You're poor");
        }else{
            stockOfItem - 1;
            balance - priceOfItem;
        }}
    public static void finishTransaction() {
        if (balance > 0) {

        }
    }*/


        /*public static double[] makeChange(double change, double[] denominations) {
        denominations = new double[]{quarter, nickel, dime};
            double[] result = new double[denominations.length];
            Arrays.sort(denominations);
            for (int i = denominations.length - 1; i >= 0; i--) {
                while (change >= denominations[i]) {
                    change -= denominations[i];
                    result[i]++;

                }
                return result;
            }


        }*/




        //If money inserted update balance



    public void purchaseItem(Items item) {
        if (balance >= item.getPrice()) {
            //dispense item
            balance = balance - item.getPrice();
        }
    }
    /*public Double returnBalance() {
        if (balance >= 0.25) {

        }*/


}







