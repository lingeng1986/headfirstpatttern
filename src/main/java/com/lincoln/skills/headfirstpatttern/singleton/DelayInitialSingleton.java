package com.lincoln.skills.headfirstpatttern.singleton;

/**
 * ��ȫ���ӳ�ʵ�����ĵ���ģʽ
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
