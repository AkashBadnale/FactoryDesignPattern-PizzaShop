package com.ab.pizzaShop;

import java.util.Scanner;

public class PizzaUtilityClass {

	static Scanner  sc = new Scanner (System.in);
	static String mySizeChoice = null;
	static String myExtraChoice = null;
	static String myPizzaChoice = null;
	
	public static void size() {
		System.out.println(" choose from one of below  option ");
		System.out.println(" 1. Small ");
		System.out.println(" 2. Medium ");
		System.out.println(" 3. Large ");
		System.out.println(" 4. Extra Large");
		
		int size = sc.nextInt();
		
		/*  we are saving the users choice about size so that we can print it later */
		if( size == 1) {
			mySizeChoice = "Small";
		}else if( size == 2) {
			mySizeChoice = "Medium";
		}else if( size == 3) {
			mySizeChoice = "Large";
		}else if( size == 4) {
			mySizeChoice = " Extra Large";
		}
	}// size()

	public static void extra() {
		System.out.println(" choose from one of the below option ");
		System.out.println("  1. Extra Cheese ");
		System.out.println("  2. Extra Topping ");
		
		int extra = sc.nextInt();
	   /* we are saving the users size about anything extra so that we can print it later */
		if( extra == 1) {
			myExtraChoice = "Extra Cheese";
		}else if( extra == 2) {
			myExtraChoice = "Extra Toppings";
		}
	}// extra()

	public static void paymentType() {
		System.out.println(" choose from one of the option  ");
		System.out.println("  1. By cash ");
		System.out.println("  2. Debit Card ");
		System.out.println("  3. Rupay Card ");
		System.out.println("  4. Credit card ");
		
		int payChoice = sc.nextInt();
		if (payChoice == 1) {
		    System.out.println(" Your  Order is -- ");
		    System.out.println(myPizzaChoice +" ----- "+ mySizeChoice +" ----- "+  myExtraChoice +" ----- ");
		    System.out.println(" your Bill ----- xxx.xx Rs.");
		}else if(payChoice == 2) {
			System.out.println(" Enter your card number ");
			System.out.println(" Your  Order is -- ");
		    System.out.println(myPizzaChoice +" ----- "+ mySizeChoice +" ----- "+  myExtraChoice +" ----- ");
		    System.out.println(" your Bill ----- xxx.xx Rs.");
		}else if(payChoice == 3) {
			System.out.println(" Enter your card number ");
			System.out.println(" Your  Order is -- ");
		    System.out.println(myPizzaChoice +" ----- "+ mySizeChoice +" ----- "+  myExtraChoice +" ----- ");
		    System.out.println(" your Bill ----- xxx.xx Rs.");
		}else if(payChoice == 4) {
			System.out.println(" Enter your card number ");
			System.out.println(" Your  Order is -- ");
		    System.out.println(myPizzaChoice +" ----- "+ mySizeChoice +" ----- "+  myExtraChoice +" ----- ");
		    System.out.println(" your Bill ----- xxx.xx Rs.");
		}
		
	}// paymentType

	public static int vegChoices() {
		System.out.println(" Choose from one of below option");
		System.out.println("1. Margherita ");
		System.out.println("2. Farm House");
		System.out.println("3. Peppy Paneer ");
		System.out.println("4. Cheese N Corn");
		System.out.println("5. Mexican green wave ");
		
		int pChoice = sc.nextInt();
		if( pChoice == 1) {
			myPizzaChoice = "Margherita";
			return 1;
		}else if( pChoice == 2) {
			myPizzaChoice = "Farm House";
			return 2;
		}else if( pChoice == 3) {
			myPizzaChoice = "Peppy Paneer";
			return 3;
		}else if( pChoice == 4) {
			myPizzaChoice = " Cheese N Corn";
			return 4;
		}else if( pChoice == 5) {
			myPizzaChoice = "Mexican Green Wave";
			return 5;
		}
		
		return 0;
	}// vegChoices()

	public static int nonvegChoices() {
		System.out.println(" Choose from one of below option");
		System.out.println("6. Pepper Barbecue");
		System.out.println("7. Chicken Tikka ");
		System.out.println("8. Chicken Sausage");
		System.out.println("9. Peri-Peri Chicken");
		System.out.println("10. Chicken Dominator");
		
		int pChoice = sc.nextInt();
		if( pChoice == 6) {
			myPizzaChoice = "Pepper Barbecue";
			return 6;
		}else if( pChoice == 7) {
			myPizzaChoice = "Chicken Tikka";
			return 7;
		}else if( pChoice == 8) {
			myPizzaChoice = "Chicken Sausage";
			return 8;
		}else if( pChoice == 9) {
			myPizzaChoice = " Peri Peri Chicken";
			return 9;
		}else if( pChoice == 10) {
			myPizzaChoice = "Chicken Dominator";
			return 10;
		}
		
		return 0;
	}// nonvegChoices()

}// PizzaUtilityClass
