package syl.study.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Think on 2016/7/17.
 */
public interface IHello extends Remote {


    public void sayHello() throws RemoteException;

    public String sayHello(String name)throws RemoteException;
}
