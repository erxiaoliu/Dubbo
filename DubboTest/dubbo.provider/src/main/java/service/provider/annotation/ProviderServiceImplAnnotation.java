package service.provider.annotation;

import com.alibaba.dubbo.config.annotation.Service;

@Service(timeout = 5000)
public class ProviderServiceImplAnnotation implements ProviderServiceAnnotation {
    public String SayHelloAnnotation(String word) {
        return word;
    }
}
