package com.lincoln.skills.headfirstpatttern.component;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	public MenuComponent next() {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
