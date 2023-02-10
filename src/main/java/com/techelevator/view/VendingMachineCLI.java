package com.techelevator.view;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String MAIN_MENU_SECRET_OPTION = "*Sales Report";

	private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";

	private static final String[] MAIN_MENU_OPTIONS = {
			MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT,
			MAIN_MENU_SECRET_OPTION };
	private static final String[] PURCHASE_MENU_OPTIONS = {
			PURCHASE_MENU_OPTION_FEED_MONEY, PURCHASE_MENU_OPTION_SELECT_PRODUCT,
			PURCHASE_MENU_OPTION_FINISH_TRANSACTION};


	private VendingMenu menu;

	public VendingMachineCLI(VendingMenu menu) {
		this.menu = menu;
	}

	public void run() throws FileNotFoundException {
		boolean running = true;
		Map<String, Items> Inventory = MakingItemsToMap.startUp();
		while (running) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			// A switch statement could also be used here.  Your choice.
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {

				for ( Map.Entry<String, Items> item : Inventory.entrySet() ){
					System.out.println(item.getValue());

				}


//				MakingItemsToMap.item();
			}
			if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {

				choice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
				// if(FEED MONEY SELECTED) { FEED MONEY TO BALANCE }
				// IF(SELECT PRODUCT SELECTED) ** ENTER ITEM NUMBER ++
				//        COMPARE BALANCE WITH ITEM COST { TRY TO PURCHASE ITEM }
				if (choice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {

					MoneyHandler.feedMoney();

				}

				if(choice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)){
					MoneyHandler.selectProduct(Inventory);
				}
				if(choice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)){



				}


//					menu.getChoiceFromOptions(PURCHASE_MENU_OPTION_FEED_MONEY){

				//FEED SELECT AND END TRANS
				//generates sale report with timestamp,
				//subtracts stock by one stock -1
			}
			if (choice.equals(MAIN_MENU_OPTION_EXIT)) {


				//complete.
			}
			if (choice.equals(MAIN_MENU_SECRET_OPTION)) {
				// sales report
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		VendingMenu menu = new VendingMenu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
