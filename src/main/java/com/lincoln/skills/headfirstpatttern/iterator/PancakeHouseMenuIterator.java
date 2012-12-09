package com.lincoln.skills.headfirstpatttern.iterator;

import java.util.List;

@Deprecated
public class PancakeHouseMenuIterator implements Iterator<MenuItem> {

	private List<MenuItem> menuItems;
	private int position = 0;

	public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public boolean hasNext() {
		if (position >= menuItems.size() || menuItems.get(position) == null) {
			return false;
		}
		return true;
	}

	public MenuItem next() {
		MenuItem item = menuItems.get(position);
		position++;

		return item;
	}

}
