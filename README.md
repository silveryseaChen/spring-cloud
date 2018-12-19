# spring-cloud

 **spring cloud 组件**
 
 参考资料：https://www.fangzhipeng.com/archive/?tag=SpringCloud

# config 2018年10月7日

  **配置中心可从git上获取相应配置**
  
  config遗留问题1：需要重启来更新配置

# eureka 2018年10月11日

  **添加eureka注册中心**
  
  eureka遗留问题1：未加入权限验证
  
# config 2018年10月13日
  
  **无需重启来刷新配置**
  
  配置中心通过调用/actuator/bus-refresh 即可更新配置，无需重启。部分解决config遗留问题1。
  
  config遗留问题2：自动刷新获取配置
  
  如果想实现自动刷新可以参考https://www.cnblogs.com/andyfengzp/p/6835969.html
  
  或者自己写个定时器处理，该功能暂未实现。
  
# hystrix turbine ribbon 2018年10月15日
  
  **hystrix 断路由 添加请求异常默认处理**
  
  **hystrix-dashboard 断路由 监控**
  
  **turbine 聚合断路由 监控**
  
  **ribbon 负载策略**
  
# zipkin 2018年10月17日  
    
   **sleuth-zipkin 链路追踪**
   
   问题：在spring-cloud-client包中加入zipkin时，但在zipkin-server中未能监控到该服务。
   怀疑是应该加入mq包的原因。
    
   **解决上述问题 2018年12月18日**
   
   zipkin 收集数据 可以通过 http 或者 rabbit kafka，默认为http
   
   可以通过 spring.zipkin.sender.type 进行设置，对应的值为 WEB RABBIT KAFKA ，具体可参见枚举类ZipkinSenderProperties.SenderType
   
   在加入spring-cloud-starter-bus-amqp 后，将会默认使用rabbit,为什么使用了rabbit不可以，下次在研究下。
   
   **解决上述问题 2018年12月19日**
   
   解决zipkin 使用rabbit 传输数据。
   
   上次的问题是client添加了rabbit支持，而server没有。在server中加入rabbit支持即可。
   
   另外sleuth默认是不持久化的，框架中提供了 mysql 和 elasticSearch 的持久化方式，后续再做补充。
    
# zuul 2018年11月04日  

   **zuul 路由+过滤**
   
# feign 2018年11月05日  

   **feign - spring cloud rpc**   
   
   集成了ribbon 和 hystrix ,所以具有负载和断路由的功能。
   
   并且使得http请求变的方便。