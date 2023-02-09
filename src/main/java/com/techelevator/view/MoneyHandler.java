package com.techelevator.view;

public class MoneyHandler {
    double quater = 0.25;
    double dime = 0.10;
    double nickel = 0.05;
    double balance = 0;
    static double inPutMoney = 0;



    public void feedMoney(double inPutMoney) {
        balance += inPutMoney;
    }

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







