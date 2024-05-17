package com.vantis.space.demo.distribute.module0;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Module0HelloInterfaceController implements Module0HelloInterface {
    private final Module0HelloServiceImpl module0HelloService;

    @Override
    public String hello(String name) {
        return module0HelloService.hello(name);
    }

    @Override
    public String module1Hello(String name) {
        return module0HelloService.module1Hello(name);
    }
}
