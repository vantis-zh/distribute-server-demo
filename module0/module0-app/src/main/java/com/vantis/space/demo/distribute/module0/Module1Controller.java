package com.vantis.space.demo.distribute.module0;

import com.vantis.space.demo.distribute.module1.Module1HelloInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("out/module1")
@RequiredArgsConstructor
public class Module1Controller {
    private final Module1HelloInterface module1HelloService;

    @GetMapping("hello/hello")
    public String hello(@RequestParam String name) {
        return module1HelloService.hello(name);
    }

    @GetMapping("hello/module0/hello")
    public String module1Hello(@RequestParam String name) {
        return module1HelloService.module0Hello(name);
    }
}
