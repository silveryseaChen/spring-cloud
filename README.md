# spring-cloud
spring cloud 组件

#config 2018年10月7日

  配置中心可从git上获取相应配置，但修改配置仍然需要重启来重新加载配置。

#eureka 2018年10月11日

  添加eureka注册中心
  
#config 2018年10月13日
  
  配置中心通过调用/actuator/bus-refresh 即可更新配置，无需重启。
  
  如果想实现自动刷新可以参考https://www.cnblogs.com/andyfengzp/p/6835969.html
  
  或者自己写个定时器处理，该功能暂未实现。
