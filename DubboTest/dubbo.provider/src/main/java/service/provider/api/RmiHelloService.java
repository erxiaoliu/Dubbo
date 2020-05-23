package service.provider.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiHelloService extends Remote {
    //远程调用的方法必须有返回值，不能为void
    public String sayHello() throws RemoteException; //必须抛出RemoteException异常,否认则Client运行时会抛出RemoteException异常
    public String sayHelloTo(String somebody) throws RemoteException;

}
