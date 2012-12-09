package com.lincoln.skills.headfirstpatttern.component;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MenuComponent allMenus = initData();

		Waitress waitress = new Waitress(allMenus);

		System.out.println("printing by iterator...");

		waitress.printByIterator();

		System.out.println("printing vegetarian ...");

		waitress.printVegetarianMenu();

		System.out.println("printing by composite iterator...");

		waitress.printByCompositeIterator();

	}

	/**
	 * @return
	 */
	private static MenuComponent initData() {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU",
				"breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "lunch");

		MenuComponent cafeMenu = new Menu("CAFE MENU", "dinner");

		MenuComponent dessertMenu = new Menu("DESSERT MENU",
				"dessert of course!");

		MenuComponent allMenus = new Menu("ALL MENUS", "all menus combined");

		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		dinerMenu
				.add(new MenuItem(
						"Pasta",
						"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
						true, 3.89));

		dinerMenu.add(dessertMenu);

		dessertMenu.add(new MenuItem("Apple Pie",
				"apple pie with a flakey crust, topped with vanilla ice cream",
				true, 1.59));
		return allMenus;
	}

}
