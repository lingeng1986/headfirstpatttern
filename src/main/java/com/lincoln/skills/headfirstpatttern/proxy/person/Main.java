package com.lincoln.skills.headfirstpatttern.proxy.person;

public class Main {

	public static void main(String[] args) {
		PersonBean me = PersonFactory.getOwnerProxy(initMe());

		me.setInterests("snooker.");
		try {
			me.setHotOrNotRating(1000);
		} catch (Exception e) {
			System.out.println("setting my rating caused exception:"
					+ e.getClass());
		}

		PersonBean someone = PersonFactory.getNotOwnerProxy(initSomeoneElse());
		someone.setHotOrNotRating(-10);
		try {
			someone.setGender("female");
		} catch (Exception e) {
			System.out.println("setting someone's gender caused exception;");
		}
	}

	private static PersonBean initSomeoneElse() {
		PersonBean someone = new PersonBeanImpl();
		someone.setName("someone");
		someone.setGender("male");
		someone.setInterests("no interest");
		someone.setHotOrNotRating(10);
		return someone;
	}

	private static PersonBean initMe() {
		PersonBean me = new PersonBeanImpl();
		me.setName("lincoln");
		me.setGender("male");
		me.setInterests("singing");
		me.setHotOrNotRating(100);
		return me;
	}

}
