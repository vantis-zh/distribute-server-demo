package com.vantis.space.demo.distribute.module1;

import com.vantis.space.demo.distribute.module0.Module0HelloInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


/**
 * 因为 GATEWAY 和服务没分层导致相互依赖 所以这里 Interface 实现
 * 可能会找到多个 因此手动指定了 @Primary
 * <br/>
 * 如果项目拆分合理的话这里其实不需要指定
 */
@Primary
@Service
@RequiredArgsConstructor
public class Module1HelloServiceImpl implements Module1HelloInterface {
    /**
     * 因为有循环依赖所以这里需要手动注入
     */
    @Autowired
    private final Module0HelloInterface module0HelloService;

    public String hello(String name) {
        return String.format("Hello %s from Module1HelloService", name);
    }

    @Override
    public String module0Hello(String name) {
        return module0HelloService.hello(name);
    }
}
