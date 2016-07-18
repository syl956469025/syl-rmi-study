package syl.study.rmi;

import syl.study.model.Account;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * 在客户端调用之前必须先启动服务端  把服务注册到注册中心
 * Created by Think on 2016/7/17.
 */
public class RemoteClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        IHello hello = (IHello) Naming.lookup("rmi://localhost:8888/RHello");
        hello.sayHello();
        System.out.println(hello.sayHello("syl !"));
        Account account = hello.getAccount();
        System.out.println(account.getMoney());
        System.out.println(account.getUsername());
    }


}
