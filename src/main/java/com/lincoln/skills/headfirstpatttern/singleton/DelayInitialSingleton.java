package com.lincoln.skills.headfirstpatttern.singleton;

/**
 * 安全的延迟实例化的单例模式
 * 
 * @author lincoln
 * 
 */
public class DelayInitialSingleton {

	private volatile static DelayInitialSingleton singleton;

	public static DelayInitialSingleton getSigleton() {
		if (singleton == null) {
			synchronized (DelayInitialSingleton.class) {
				if (singleton == null) {
					System.out.println("initialing "
							+ DelayInitialSingleton.class.getSimpleName());
					singleton = new DelayInitialSingleton();
				}
			}
		}

		return singleton;
	}

	private DelayInitialSingleton() {
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {

				public void run() {
					DelayInitialSingleton.getSigleton();

				}
			}).start();
		}
	}

}
