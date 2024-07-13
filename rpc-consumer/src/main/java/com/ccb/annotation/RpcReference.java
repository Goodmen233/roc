package com.ccb.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Autowired
public @interface RpcReference {

    /**
     * 使用的服务版本
     *
     * @return 版本号
     */
    String serviceVersion() default "1.0";

    /**
     * 注册中心类型
     *
     * @return 注册中心类型
     */
    String registryType() default "ZOOKEEPER";

    /**
     * 注册中心地址
     *
     * @return 地址
     */
    String registryAddress() default "127.0.0.1:2181";

    /**
     * 超时时间
     *
     * @return 毫秒数
     */
    long timeout() default 5000;

}
