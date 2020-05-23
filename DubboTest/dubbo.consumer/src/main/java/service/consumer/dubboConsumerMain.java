package service.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.provider.api.ProviderService;

import java.io.IOException;

public class dubboConsumerMain {
        public static void main(String[] args) {
            ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("consumer.xml");
            c.start();
            ProviderService providerService = (ProviderService) c.getBean(ProviderService.class);
            String dubbo = providerService.SayHello("dubbo");
            System.out.println(dubbo);
            System.out.println("调用完成....");
            try {
                System.in.read();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
}
