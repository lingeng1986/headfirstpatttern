package com.lincoln.skills.headfirstpatttern.factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if ("cheese".equals(type)) {
			return new ChicagoCheesePizza();
		}
		return null;
	}

}
