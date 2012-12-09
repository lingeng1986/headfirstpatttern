package com.lincoln.skills.headfirstpatttern.component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
	List<MenuComponent> menuComponents;
	private String name;
	private String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
		menuComponents = new ArrayList<MenuComponent>();
	}

	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	public MenuComponent getChild(int index) {
		return menuComponents.get(index);
	}

	public String getName() {
		return name;
	}

	public String getDescriptin() {
		return description;
	}

	public void print() {
		System.out.println(this);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.name + "," + this.description);
		sb.append("\r\n");
		for (MenuComponent menuComponent : menuComponents) {
			sb.append(menuComponent.toString());
			sb.append("\r\n");
		}

		return sb.toString();
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		return menuComponents.iterator();
	}
}
