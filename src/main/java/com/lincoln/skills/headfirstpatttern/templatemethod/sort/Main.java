package com.lincoln.skills.headfirstpatttern.templatemethod.sort;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ComparableDuck[] ducks = { new ComparableDuck(1),
				new ComparableDuck(200), new ComparableDuck(100) };

		print(ducks);

		Arrays.sort(ducks);

		print(ducks);

	}

	/**
	 * @param ducks
	 */
	private static void print(ComparableDuck[] ducks) {
		for (ComparableDuck duck : ducks) {
			System.out.println(duck);
		}
	}

}
