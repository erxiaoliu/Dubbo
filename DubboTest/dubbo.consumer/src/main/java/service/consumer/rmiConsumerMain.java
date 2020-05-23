package service.consumer;

import service.provider.api.RmiHelloService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class rmiConsumerMain {

    public static void main(String[] args) {
            try {
                //在RMI服务注册表中查找名称为RHello的对象，并调用其上的方法
                RmiHelloService localHello = (RmiHelloService)Naming.lookup("rmi://localhost:8888/RmiHello");
                System.out.println(localHello.sayHello());
                System.out.println(localHello.sayHelloTo("dubbo装逼时刻"));
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
    }
}
