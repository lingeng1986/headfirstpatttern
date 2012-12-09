package com.lincoln.skills.headfirstpatttern.decorate.sanjibuck;

import java.util.ArrayList;
import java.util.List;

/***
 * 我的装饰者模式
 * 
 * @author lincoln
 * 
 */
public class Main {

	public static void main(String[] args) {
		Beverage houseBlend = new HouseBlend();

		Beverage houseBlendWithMilk = new BeverageWithMilk(new HouseBlend());

		List<Beverage> beverages = new ArrayList<Beverage>();
		beverages.add(houseBlend);
		beverages.add(houseBlendWithMilk);

		System.out.println("beverages:");
		for (Beverage beverage : beverages) {
			System.out.println(beverage.description() + " cost:"
					+ beverage.cost());
		}

	}
}
