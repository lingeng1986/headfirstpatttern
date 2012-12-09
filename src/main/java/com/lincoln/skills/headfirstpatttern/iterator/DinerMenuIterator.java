package com.lincoln.skills.headfirstpatttern.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

	private MenuItem[] menuItems;

	private int position = 0;

	public DinerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	public boolean hasNext() {
		if (position >= menuItems.length || menuItems[position] == null) {
			return false;
		}
		return true;
	}

	public MenuItem next() {
		MenuItem item = menuItems[position];
		position++;
		return item;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
