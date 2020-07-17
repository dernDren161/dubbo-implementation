package com.provider.myProvider.provider;

import com.api.testDubbo;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@DubboService(version = "1.0.0")
public class myProvider implements testDubbo {

    @Value("${dubbo.provider.name}")
    private String myName;

    @Override
    public String testName(String s) {
        return "Hello "+ myName + " Please meet " + s;
    }
}
