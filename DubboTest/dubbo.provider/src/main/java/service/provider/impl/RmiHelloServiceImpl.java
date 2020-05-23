package service.provider.impl;


import service.provider.api.RmiHelloService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RmiHelloServiceImpl extends UnicastRemoteObject implements RmiHelloService {
    public RmiHelloServiceImpl() throws RemoteException {
    }

    public String sayHello() throws RemoteException {
        //System.out.println("hello!");
        return "hello";
    }

    public String sayHelloTo(String somebody) throws RemoteException {
        //System.out.println("hello!");
        return "hello"+somebody;
    }
}
