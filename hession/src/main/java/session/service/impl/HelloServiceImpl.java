package session.service.impl;

import hession.service.api.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String helloWorld(String message) {
        return "hello," + message;
    }
}
