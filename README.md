# distribute-server-demo

本服务集群用于展示多模块服务的拆分、组装

## 项目结构

* module0：服务模块0
* module0：服务模块1
    * module1-share: 内部接口定义
    * module1-core: 内部接口的本地实现 **依赖了 module0-share**
    * module1-service: 内部接口的远程实现
    * module1-client: 内部接口的远程调用客户端
    * module1-starter: 内部接口的配置，控制其他的项目是本地引用还是远程调用
        * 包含 module1-core 或者 module1-client 其一
    * module1-app: 独立模块的启动包 **依赖了 module0-starter**

以上模块中 module0、module1相互依赖 且 module0 同时兼任了网关层，以贴近目前实际。最佳实践中，网关层最好拆分。

配置包是 moduleX-starter，控制启动方式交由服务模块的负责人指定，调用方仅需注入对应接口即可。

在需要进行本地、远程调用切换时，服务提供者的负责人仅需注意是否启动本地服务、修改 moduleX-starter 的依赖包即可完成，服务使用者无需关心。

注意: core 层只会依赖其他服务的 share 包, 在 app 层指定对应模块的 starter 包

注意: 具体的模块设计中，还应注意基础模块、业务模块的分层，理论上不应出现同层及反向的服务调用。但也需要考虑实际及远期规模，确认是否为过度设计。

[spring.factories 替换](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Migration-Guide#auto-configuration-files)

```shell
curl -X GET http://localhost:8081/out/module0/module10/hello?name=vantis
```
