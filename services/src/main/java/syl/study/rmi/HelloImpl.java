package syl.study.rmi;

import syl.study.model.Account;
import syl.study.rmi.IHello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Think on 2016/7/17.
 */
public class HelloImpl extends UnicastRemoteObject implements IHello {


    /**
     * 因为UnicastRemoteObject的构造方法抛出了RemoteException异常，
     * 因此这里默认的构造方法必须写，必须声明抛出RemoteException异常
     * @throws RemoteException
     */
    protected HelloImpl() throws RemoteException {
    }

    public void sayHello() throws RemoteException {
        System.out.println("Hello world !");
    }

    public String sayHello(String name) throws RemoteException {
        return "Hello " + name;
    }

    public Account getAccount() throws RemoteException {
        Account account = new Account();
        account.setMoney(123456.00);
        account.setUsername("zhangsanfeng");
        return account;
    }
}
