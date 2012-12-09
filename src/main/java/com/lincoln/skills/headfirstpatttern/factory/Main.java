package com.lincoln.skills.headfirstpatttern.factory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		Pizza nyCheesePizza = nyStore.orderPizza("cheese");

		PizzaStore chStore = new ChicagoPizzaStore();
		Pizza chCheesePizza = chStore.orderPizza("cheese");

		System.out.println(nyCheesePizza.name + " is done.");

		System.out.println(chCheesePizza.name + " is done.");
	}

}
