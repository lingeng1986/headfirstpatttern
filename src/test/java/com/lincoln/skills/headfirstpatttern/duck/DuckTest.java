package com.lincoln.skills.headfirstpatttern.duck;

import java.awt.Color;

import junit.framework.TestCase;

import org.junit.Test;

import com.lincoln.skills.headfirstpatttern.strategy.duck.Duck;
import com.lincoln.skills.headfirstpatttern.strategy.duck.LivedDuck;
import com.lincoln.skills.headfirstpatttern.strategy.duck.PlasticDuck;
import com.lincoln.skills.headfirstpatttern.strategy.duck.RocketFlyBehavior;

public class DuckTest extends TestCase {

	@Test
	public void testGetLivedDuck() {
		Duck livedDuck = new LivedDuck();

		assertEquals(Color.YELLOW.toString(), livedDuck.getColor());
		assertEquals("gagaga.", livedDuck.quack());
		assertEquals("i'm good at flying.", livedDuck.fly());

	}

	@Test
	public void testGetPlasticDuck() {
		Duck plasticDuck = new PlasticDuck();

		assertEquals(Color.GREEN.toString(), plasticDuck.getColor());
		assertEquals("jijiji.", plasticDuck.quack());
		assertEquals("i cannot fly.", plasticDuck.fly());

		plasticDuck.setFlyBehavior(new RocketFlyBehavior());

		assertEquals("i'm flying with rocket!", plasticDuck.fly());
	}
}
