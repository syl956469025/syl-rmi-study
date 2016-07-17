package syl.study.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Think on 2016/7/17.
 */
public class RemoteClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        IHello hello = (IHello) Naming.lookup("rmi://localhost:8888/RHello");
        hello.sayHello();
        System.out.println(hello.sayHello("syl !"));
    }


}
