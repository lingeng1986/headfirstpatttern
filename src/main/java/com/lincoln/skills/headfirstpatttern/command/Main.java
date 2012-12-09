package com.lincoln.skills.headfirstpatttern.command;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Light light = new Light();
		Command lightOn = new LightOnCommand(light);
		Command lightOff = new LightOffCommand(light);
		Controller controller = new Controller(1);
		controller.setOnCommand(0, lightOn);
		controller.setOffCommand(0, lightOff);

		controller.onButtonPressed(0);
		controller.offButtonPressed(0);

		controller.undo();
		controller.undo();
		controller.undo();
	}

}
