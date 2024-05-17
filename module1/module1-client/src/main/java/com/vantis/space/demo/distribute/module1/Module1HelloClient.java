package com.vantis.space.demo.distribute.module1;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "module1-app")
public interface Module1HelloClient extends Module1HelloInterface {
}
