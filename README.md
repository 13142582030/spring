# 项目介绍

基于Spring + SpringMVC + Mybatis 三种框架整合的后端开源项目模板。

SpringMVC框架实现了对前端请求的接收，

Spring框架实现了IOC容器的管理，AOP的日志管理

Mybatis框架实现了对数据源的整合，以及事务控制

## 目录介绍

#### java目录

保存表现层（controller）、业务层（service）、持久层（dao）、数据库实体类（pojo）、

aop的日志类（aop）

#### resources目录

spring.xml  ：spring的配置内容 + spring整合mybatis的配置内容

springmvc.xml ：springmvc的配置内容

mybatis.xml ：用于spring.xml中spring整合mybatis部分，内含映射文件位置

mapper文件夹：映射文件

mybatis-generator.xml : mybatis逆向工程文件



#### 项目运行

能够运行该项目的前提是，本地maven仓库拥有pom.xml中所有的依赖包，

而且spring.xml中数据源那儿的名称、密码、url、驱动请填自己的。

若要使用mybatis逆向工程，请在mybatis-generator.xml中定义自己的用户、密码、url、驱动内容



#### 基础版本

tomcat版本9.0.27
spring版本5.1.9

其他略

