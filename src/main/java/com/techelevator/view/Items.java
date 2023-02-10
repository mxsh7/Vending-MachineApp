package com.techelevator.view;

public class Items {
    private String locator;
    private String nameOfItem;
    private double price;
    private String typeOfItem;
    private int stock;


    public Items(String locator, String nameOfItem, double price, String typeOfItem, int stock) {
        this.locator = locator;
        this.nameOfItem = nameOfItem;
        this.price = price;
        this.typeOfItem = typeOfItem;
        this.stock = stock;
    }
    public Items(String locator, String nameOfItem, double price, String typeOfItem) {
        this.locator = locator;
        this.nameOfItem = nameOfItem;
        this.price = price;
        this.typeOfItem = typeOfItem;
    }
    @Override
    public String toString(){
        return locator + " " + nameOfItem + " " + " $" + price + " Items in stock: " + stock;

    }

    public int getStock() {return stock;}
    public void setStock(int stock) {this.stock = stock;}
    public String getLocator() {return locator;}
    public String getNameOfItem() {return nameOfItem;}
    public double getPrice() {return price;}
    public String getTypeOfItem() {return typeOfItem;}
    public void setLocator(String locator) {this.locator = locator;}
    public void setNameOfItem(String nameOfItem) {this.nameOfItem = nameOfItem;}
    public void setPrice(double price) {this.price = price;}
    public void setTypeOfItem(String typeOfItem) {this.typeOfItem = typeOfItem;}
}
