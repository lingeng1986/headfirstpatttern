package com.lincoln.skills.headfirstpatttern.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {

	static final int MAX_ITEMS = 6;

	int numberOfItems = 0;

	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Vegetarian BLT",
				"(Fakin') Bacon with lettuce & tomato on whole wheat", true,
				2.99);

		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false,
				2.99);

		addItem("Hotdog",
				"A hot dog, with saurkraut, relish, onions, topped with chees",
				false, 3.05);
	}

	private void addItem(String name, String description, boolean vegetarian,
			double price) {
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("sorry, menu is full.");
			return;
		}

		MenuItem item = new MenuItem(name, description, vegetarian, price);
		menuItems[numberOfItems] = item;
		numberOfItems++;
	}

	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}

}
