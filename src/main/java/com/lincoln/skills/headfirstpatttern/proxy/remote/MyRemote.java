package com.lincoln.skills.headfirstpatttern.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {

	static final long serialVersionUID = 2395024736367018923L;

	public String sayHello() throws RemoteException;

}
