package com.lincoln.skills.headfirstpatttern.templatemethod.hook;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("dripping coffee through filter.");
	}

	@Override
	void addCondiments() {
		System.out.println("adding sugar and milk.");
	}

	@Override
	protected boolean customerWantsCondiments() {
		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		}
		return false;
	}

	private String getUserInput() {
		String answer = null;

		System.out
				.println("would you like milk and sugar with your coffee?(y/n)");

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			answer = reader.readLine();
		} catch (Exception e) {
			System.err.println("error to read your answer.");
		}
		if (answer == null) {
			return "no";
		}

		return answer;
	}

}
