package com.lincoln.skills.headfirstpatttern.proxy.person;

import java.lang.reflect.Proxy;

public class PersonFactory {

	public static PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass()
				.getClassLoader(), person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}

	public static PersonBean getNotOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass()
				.getClassLoader(), person.getClass().getInterfaces(),
				new NotOwnerInvocationHandler(person));
	}

}
