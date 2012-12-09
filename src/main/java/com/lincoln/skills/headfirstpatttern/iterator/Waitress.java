package com.lincoln.skills.headfirstpatttern.iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {

	private List<Menu> menus;

	public Waitress(List<Menu> menus) {
		this.menus = menus;
	}

	public void printMenu() {
		for (Menu menu : menus) {
			printMenu(menu.createIterator());
		}

	}

	private void printMenu(Iterator<MenuItem> dinerMenuItems) {
		while (dinerMenuItems.hasNext()) {
			System.out.println(dinerMenuItems.next());
		}
	}

}
