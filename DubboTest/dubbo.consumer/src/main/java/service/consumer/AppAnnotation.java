package service.consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.consumer.annotation.ConsumerAnnotationService;
import service.consumer.configuration.ConsumerConfiguration;

import java.io.IOException;

public class AppAnnotation {

    public static void main( String[] args ) throws IOException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start(); // 启动
        ConsumerAnnotationService consumerAnnotationService = context.getBean(ConsumerAnnotationService.class);
        String hello = consumerAnnotationService.doSayHello("annotation"); // 调用方法
        System.out.println("result: " + hello); // 输出结果

    }
}
