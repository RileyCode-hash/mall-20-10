# mall-20-10
尚硅谷的分布式电商

坑一：用的最新版的正版IDE, 没有视频中的老师的版本。刚开始还用笔记本电脑

坑二：用了window7的台式电脑，安装mysql，vagrant的时候，因为ssh等等问题，花费了一周的时间。最后重装了系统，一路畅通

nacos作为注册中心调试OpenFeign,坑

都是最新的spring cloud，因为IDE就没有视频中的2.4多少自带阿里巴巴可选的低版本的spring boot选择。

这里OpenFeign出现问题：java.lang.IllegalStateException: No Feign Client for loadBalancing defined. Did you forget to include spring-cloud-starter-netflix-ribbon?

装了loadbalance依赖等等各种，发现openFeign，或者新的spring could自带，后面在英文github中问发现FeignClient这里，老师视频是后面接（value=name），要完整接上url， FeignClient（value="name", url="调用的地址localhost：7000“）


