package com.ab.pizzaShop;

public class PizzaFactory {

	public static Pizza getPizza(int pizzaChoice) {

		if (pizzaChoice == 1) {
			return new Margherita();
		} else if (pizzaChoice == 2) {
			return new FarmHouse();
		} else if (pizzaChoice == 3) {
			return new PeppyPaneer();
		} else if (pizzaChoice == 4) {
			return new CheeseNCorn();
		} else if (pizzaChoice == 5) {
			return new MexicanGreenWave();
		} else if (pizzaChoice == 6) {
			return new PepperBarbecue();
		} else if (pizzaChoice == 7) {
			return new ChickenTikka();
		} else if (pizzaChoice == 8) {
			return new ChickenSausage();
		} else if (pizzaChoice == 9) {
			return new PeriPeriChicken();
		} else if (pizzaChoice == 10) {
			return new ChickenDominator();
		} else {
			return null;
		} // if - else if - else
	}// getPizza
}// PizzaFactory
