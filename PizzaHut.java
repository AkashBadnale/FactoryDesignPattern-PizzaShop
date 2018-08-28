package com.ab.pizzaShop;

import java.util.Scanner;

public class PizzaHut {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println(" ----------------------- ");

		System.out.println("  choose and press one of the option -");
		System.out.println(" what type of pizza  do you want ");
		System.out.println(" 1. veg");
		System.out.println(" 2. nonveg");

		int vegNnonvegChoice = userInput.nextInt();

		switch (vegNnonvegChoice) {
		case 1:
			int pizzaChoice1 = 	 PizzaUtilityClass.vegChoices();
		   
			/* Below here we are taking the choice of pizza from user &  saving it into pizzaChoice1
			 * Then  passing the choice to getPizza so that we can get  object of respective class 
			 * Then we are saving the object of that class in  "vegUsersPizzaChoice"  */
			
			if (pizzaChoice1 == 0) {
				System.out.println("  Enter correct choice ");
				break;
			}else {
				Pizza   vegUsersPizzaChoice = PizzaFactory.getPizza(pizzaChoice1);
				
				vegUsersPizzaChoice.getSize();
				vegUsersPizzaChoice.getExtra();
				break;
			}
			
		
		case 2:
			int pizzaChoice2  =  PizzaUtilityClass.nonvegChoices();
			
			/* Below here we are taking the choice of pizza from user &  saving it into pizzaChoice1
			 * Then  passing the choice to getPizza so that we can get  object of respective class 
			 * Then we are saving the object of that class in  "vegUsersPizzaChoice"  */
			
			if(pizzaChoice2 == 0) {
				System.out.println(" Enter correct choice ");
				break;
			}else {
				Pizza nonvegUsersPizzaChoice = PizzaFactory.getPizza(pizzaChoice2);
				
				nonvegUsersPizzaChoice.getSize();
				nonvegUsersPizzaChoice.getExtra();
				break;
			}
			
		default:
			System.out.println(" Enter one of the option given above only ");
			
		}// switch
		
		PizzaUtilityClass.paymentType();
	
		
	}// main

}// PizzaHut
