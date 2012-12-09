package com.lincoln.skills.headfirstpatttern.decorate.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int c;
		try {
			@SuppressWarnings("resource")
			InputStream input = new LowerCaseInputStream(
					new BufferedInputStream(
							new FileInputStream(
									"F:\\workspaces\\workspace1\\headfirstpatttern\\src\\main\\java\\com\\lincoln\\skills\\headfirstpatttern\\decorate\\io\\test.txt")));

			while ((c = input.read()) >= 0) {
				System.out.print((char) c);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
