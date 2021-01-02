package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*nacos作为注册中心和配置中心的使用
1. 引入依赖：nacos-cofig
2.创建一个bootstrap.properties：
spring.applicaion.name = gulimall-coupon
spring.colou.nacos.config.server-addr = 127.0.0.1:8848
3.需要给配置中心默认添加一个数据集（data id）gulimall-coupon.properties
默认规则， 应用名.properties
4.给 应用名.properties添加任何配置
5.动态获取配置
@RefreshScope ： 动态获取并刷新配置
@Value（“￥{配置项的名}”）：获取到配置

配置中心和当前应用的配置文件都有，nacos配置中心的优先
*
* */

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
