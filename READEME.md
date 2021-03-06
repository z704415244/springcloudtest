##1. Eureka
&#8195;&#8195;
Eureka分为服务注册中心和客户端两部分
  
##2. Ribbon
&#8195;&#8195;
ribbon是一个负载均衡客户端，与rest配合使用进行服务间的调用

##3. Feign
&#8195;&#8195;
feign和ribbon的功能类似，他在内部集成了rest

##4. Hytric
&#8195;&#8195;
在微服务架构中，根据业务来拆分成一个个的服务，服务与服务之间可以相互调用（RPC），在Spring Cloud可以用RestTemplate+Ribbon和Feign来调用。为了保证其高可用，单个服务通常会集群部署。由于网络原因或者自身的原因，服务并不能保证100%可用，如果单个服务出现问题，调用这个服务就会出现线程阻塞，此时若有大量的请求涌入，Servlet容器的线程资源会被消耗完毕，导致服务瘫痪。服务与服务之间的依赖性，故障会传播，会对整个微服务系统造成灾难性的严重后果，这就是服务故障的“雪崩”效应。

&#8195;&#8195;
为了解决这个问题，业界提出了断路器模型。当调用出现阻塞时，通过断路器中断被刺调用，防止大量消耗资源

##5. Zuul
&#8195;&#8195;
zuul作为路由网关，有两个功能

&#8195;&#8195;
1.负载均衡：对接收到的请求转发到不同的服务，降低彼此间的压力

&#8195;&#8195;
2.过滤器：对不满足要求的请求直接进行拦截处理

##6.Spring Cloud Config
&#8195;&#8195;
在分布式系统中，由于服务数量巨多，为了方便服务配置文件统一管理，实时更新，所以需要分布式配置中心组件。在Spring Cloud中，有分布式配置中心组件spring cloud config ，它支持配置服务放在配置服务的内存中（即本地），也支持放在远程Git仓库中。在spring cloud config 组件中，分两个角色，一是config server，二是config client。