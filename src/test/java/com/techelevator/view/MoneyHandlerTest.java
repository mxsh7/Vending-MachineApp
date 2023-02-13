package com.techelevator.view;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

class MoneyHandlerTest {

    @Test
    public void feedMoney() {



    }

    @Test
    void selectProduct() throws FileNotFoundException {

        Map<String, Items> Inventory = MakingItemsToMap.startUp();


        Items newItem = Inventory.get("A1");


        Assert.assertEquals("Potato Crisps", newItem.getNameOfItem());

    }

    @Test
    void getChange() {




    }
}