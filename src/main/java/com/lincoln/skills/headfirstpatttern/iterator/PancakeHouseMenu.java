package com.lincoln.skills.headfirstpatttern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {

	List<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("KB's Pancake Breakfast",
				"Pancakes with scrambled eggs, and toast", true, 2.99);

		addItem("Regular Pancake Breakfase",
				"Pancakes with fried eggs, sausage", false, 2.99);

		addItem("Blueberry Pancakes", "Pancakes made with fresh bluberries",
				true, 3.49);

		addItem("Wlffles",
				"Waffles, with your choice of blueberries or strawberries",
				true, 3.99);

	}

	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}

	private void addItem(String name, String description, boolean vegetarian,
			double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		menuItems.add(item);
	}

}
