package service.consumer.annotation;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import service.provider.annotation.ProviderServiceAnnotation;

@Component("annotatedConsumer")
public class ConsumerAnnotationService {
    @Reference
    private ProviderServiceAnnotation providerServiceAnnotation;

    public String doSayHello(String name) {
        return providerServiceAnnotation.SayHelloAnnotation(name);
    }
}
