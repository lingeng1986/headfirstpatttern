package com.lincoln.skills.headfirstpatttern.observer.swingactionlistener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	JFrame frame;

	public static void main(String[] args) {
		Main example = new Main();
		example.go();
	}

	private void go() {
		frame = new JFrame();

		JButton button = new JButton("do it or not?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setVisible(true);

	}

	public class DevilListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("u made a big mistake.");
		}

	}

	public class AngelListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("good job boy.");
		}

	}

}
