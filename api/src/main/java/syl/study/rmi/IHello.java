package syl.study.rmi;

import syl.study.model.Account;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * 定义一个远程接口，必须继承Remote接口，其中需要远程调用的方法必须抛出RemoteException异常
 * Created by Think on 2016/7/17.
 */
public interface IHello extends Remote {


    public void sayHello() throws RemoteException;

    public String sayHello(String name)throws RemoteException;


    /**
     * 返回的对象必须实现Serializable接口，使该对象可以序列化
     * @return
     * @throws RemoteException
     */
    public Account getAccount() throws RemoteException;
}
