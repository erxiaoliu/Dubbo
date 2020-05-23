package service.provider.api;

public class ProviderServiceMock implements ProviderService {

    public String SayHello(String word) {
        System.out.println("dubbo mock sample....");
        return "say hello fail Mock";
    }
}
