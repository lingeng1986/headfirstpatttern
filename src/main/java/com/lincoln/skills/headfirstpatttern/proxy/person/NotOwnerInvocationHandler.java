package com.lincoln.skills.headfirstpatttern.proxy.person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * 调用处理器，作为PersonBean的代理，处理调用其他人对象的方法时使用；
 * 
 * 在这里，代理类的功能是做权限校验
 * 
 * @author lincoln
 * 
 */
public class NotOwnerInvocationHandler implements InvocationHandler {

	PersonBean person;

	public NotOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				return method.invoke(person, args);
			} else {
				throw new IllegalAccessException(method.getName());
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;

	}

}
