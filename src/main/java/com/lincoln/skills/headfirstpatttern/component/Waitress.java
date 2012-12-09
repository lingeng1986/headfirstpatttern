package com.lincoln.skills.headfirstpatttern.component;

import java.util.Iterator;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void print() {
		allMenus.print();
	}

	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = getIterator();
		while (iterator.hasNext()) {
			MenuComponent menu = iterator.next();
			try {
				if (menu.isVegetarian()) {
					menu.print();
				}
			} catch (UnsupportedOperationException ex) {

			}
		}
	}

	public void printByIterator() {
		Iterator<MenuComponent> iterator = getIterator();
		while (iterator.hasNext()) {
			iterator.next().print();
		}
	}

	public void printByCompositeIterator() {
		CompositeIterator iterator = getCompositeIterator();
		while (iterator.hasNext()) {
			try {
				iterator.next().print();
			} catch (UnsupportedOperationException ex) {
			}
		}
	}

	/**
	 * @return
	 */
	private Iterator<MenuComponent> getIterator() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		return iterator;
	}

	private CompositeIterator getCompositeIterator() {
		CompositeIterator iterator = new CompositeIterator(
				allMenus.createIterator());
		return iterator;
	}
}
