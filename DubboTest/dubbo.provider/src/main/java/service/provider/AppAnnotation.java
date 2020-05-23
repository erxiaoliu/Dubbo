package service.provider;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.provider.configuration.DubboConfiguration;

import java.io.IOException;

public class AppAnnotation {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConfiguration.class);
        context.start();
        System.in.read();
    }
}
