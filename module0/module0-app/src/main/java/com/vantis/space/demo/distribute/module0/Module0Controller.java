package com.vantis.space.demo.distribute.module0;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("out/module0")
@RequiredArgsConstructor
public class Module0Controller {
    private final Module0HelloServiceImpl module0HelloService;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return module0HelloService.hello(name);
    }

    @GetMapping("/module1/hello")
    public String module1Hello(@RequestParam String name) {
        return module0HelloService.module1Hello(name);
    }

    @GetMapping("/module10/hello")
    public String module10Hello(@RequestParam String name) {
        return module0HelloService.module10Hello(name);
    }
}
