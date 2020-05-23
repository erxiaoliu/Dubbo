package service.consumer;

import com.caucho.hessian.client.HessianProxyFactory;
import service.provider.api.ProviderService;

import java.net.MalformedURLException;

public class hessionConsumerMain {
    public static void main(String[] args) throws MalformedURLException {
        String url = "http://localhost:8080/hessian-showcase/hessian";
        System.out.println(url);
        HessianProxyFactory factory = new HessianProxyFactory();
        ProviderService helloService = (ProviderService) factory.create(ProviderService.class, url);
        System.out.println(helloService.SayHello("jimmy"));
    }
}
