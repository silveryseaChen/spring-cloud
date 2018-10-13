# spring-cloud
spring cloud 组件

#config 2018年10月7日

  配置中心可从git上获取相应配置
  
  config遗留问题1：需要重启来更新配置

#eureka 2018年10月11日

  添加eureka注册中心
  
  eureka遗留问题1：未加入权限验证
  
#config 2018年10月13日
  
  配置中心通过调用/actuator/bus-refresh 即可更新配置，无需重启。
  
  config遗留问题2：自动刷新获取配置
  
  如果想实现自动刷新可以参考https://www.cnblogs.com/andyfengzp/p/6835969.html
  
  或者自己写个定时器处理，该功能暂未实现。
