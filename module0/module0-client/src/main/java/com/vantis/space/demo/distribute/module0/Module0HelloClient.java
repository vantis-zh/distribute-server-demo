package com.vantis.space.demo.distribute.module0;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("module0-app")
public interface Module0HelloClient extends Module0HelloInterface {
}
