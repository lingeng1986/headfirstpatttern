package com.lincoln.skills.headfirstpatttern.proxy.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	private static final long serialVersionUID = 2082633636429813845L;

	protected MyRemoteImpl() throws RemoteException {

	}

	public String sayHello() throws RemoteException {
		return "server says: hello. ";
	}

	public static void main(String[] args) {
		try {
			MyRemote server = new MyRemoteImpl();
			Naming.rebind("localhost/RemoteHello", server);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
