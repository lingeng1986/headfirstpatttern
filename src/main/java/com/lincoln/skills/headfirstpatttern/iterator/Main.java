package com.lincoln.skills.headfirstpatttern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		List<Menu> menus = new ArrayList<Menu>();
		menus.add(dinerMenu);
		menus.add(pancakeHouseMenu);

		Waitress waitress = new Waitress(menus);

		waitress.printMenu();
	}

}
