package service.provider.impl;

import service.provider.api.ProviderService;

public class ProviderServiceImpl implements ProviderService {

    public String SayHello(String word) {
        return "服务方被调用,传入的参数为:"+word;
    }
}
