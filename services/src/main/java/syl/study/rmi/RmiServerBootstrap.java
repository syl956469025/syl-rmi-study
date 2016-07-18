package syl.study.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *创建RMI注册表，启动RMI服务，并将远程对象注册到RMI注册表中。
 *
 * 在启动这个服务之前 必须先在  cmd命令中启动  start rmiregistry 服务
 * Created by Think on 2016/7/17.
 */
public class RmiServerBootstrap {


    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException {
        HelloImpl hello = new HelloImpl();
        //本地主机上的远程对象注册表Registry的实例，并指定端口为8888，
        // 这一步必不可少（Java默认端口是1099），必不可缺的一步，缺少注册表创建，则无法绑定对象到远程注册表上
        LocateRegistry.createRegistry(8888);
        //把远程对象注册到RMI注册服务器上，并命名为RHello
        Naming.bind("rmi://localhost:8888/RHello",hello);
        System.out.println(" rmi 对象绑定成功 ！");
    }
}
