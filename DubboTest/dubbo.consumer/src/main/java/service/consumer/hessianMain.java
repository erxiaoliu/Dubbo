package service.consumer;


import java.net.MalformedURLException;
import com.caucho.hessian.client.HessianProxyFactory;
import hession.service.api.HelloService;
public class hessianMain {
    public static void main(String[] args) throws MalformedURLException {
        String url = "http://localhost:8080/hessian-showcase/hessian";
        System.out.println(url);
        HessianProxyFactory factory = new HessianProxyFactory();
        HelloService helloService = (HelloService) factory.create(HelloService.class, url);
        System.out.println(helloService.helloWorld("jimmy"));
    }
}
