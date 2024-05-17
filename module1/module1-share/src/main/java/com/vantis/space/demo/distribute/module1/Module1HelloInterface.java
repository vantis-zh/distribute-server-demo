package com.vantis.space.demo.distribute.module1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface Module1HelloInterface {
    @PostMapping("hello")
    String hello(@RequestBody String name);

    @PostMapping("module0/hello")
    String module0Hello(@RequestBody String name);
}
