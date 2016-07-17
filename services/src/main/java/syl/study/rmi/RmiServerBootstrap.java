package syl.study.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by Think on 2016/7/17.
 */
public class RmiServerBootstrap {


    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException {
        HelloImpl hello = new HelloImpl();
        LocateRegistry.createRegistry(8888);
        Naming.bind("rmi://localhost:8888/RHello",hello);
        System.out.println(" rmi 对象绑定成功 ！");
    }
}
