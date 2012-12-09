package com.lincoln.skills.headfirstpatttern.factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if ("cheese".equals(type)) {
			return new NYCheesePizza();
		}
		return null;
	}

}
