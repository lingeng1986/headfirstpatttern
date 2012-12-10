package com.lincoln.skills.headfirstpatttern.proxy.person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * 调用处理器，作为PersonBean的代理，处理调用自己对象方法时使用；
 * 
 * 在这里，代理类的功能是做权限校验
 * 
 * @author lincoln
 * 
 */
public class OwnerInvocationHandler implements InvocationHandler {

	PersonBean person;

	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws IllegalAccessException {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				throw new IllegalAccessException(method.getName());
			} else if (method.getName().startsWith("set")) {
				return method.invoke(person, args);
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;

	}
}
