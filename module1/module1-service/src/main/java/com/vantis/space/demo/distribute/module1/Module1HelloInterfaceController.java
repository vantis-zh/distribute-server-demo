package com.vantis.space.demo.distribute.module1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Module1HelloInterfaceController implements Module1HelloInterface {
    private final Module1HelloServiceImpl module1HelloService;

    @Override
    public String hello(String name) {
        return module1HelloService.hello(name);
    }

    @Override
    public String module0Hello(String name) {
        return module1HelloService.module0Hello(name);
    }
}
