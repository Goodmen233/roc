package com.ccb.annotation;


import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface RpcService {

    /**
     * 服务类型
     *
     * @return 类类型
     */
    Class<?> serviceInterface() default Object.class;

    /**
     * 服务版本
     *
     * @return 版本号
     */
    String serviceVersion() default "1.0";
}
