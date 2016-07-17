package syl.study.rmi;

import syl.study.rmi.IHello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Think on 2016/7/17.
 */
public class HelloImpl extends UnicastRemoteObject implements IHello {


    protected HelloImpl() throws RemoteException {
    }

    public void sayHello() throws RemoteException {
        System.out.println("Hello world !");
    }

    public String sayHello(String name) throws RemoteException {
        return "Hello " + name;
    }
}
