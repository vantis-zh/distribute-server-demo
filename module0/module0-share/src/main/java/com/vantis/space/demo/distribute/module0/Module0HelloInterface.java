package com.vantis.space.demo.distribute.module0;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface Module0HelloInterface {
    @PostMapping("hello")
    String hello(@RequestBody String name);

    @PostMapping("module1/hello")
    String module1Hello(@RequestBody String name);
}
