package com.ccb.factory;

import com.ccb.enums.RegistryType;
import com.ccb.service.RegistryService;
import com.ccb.service.impl.EurekaRegistryService;
import com.ccb.service.impl.ZookeeperRegistryService;

public class RegistryFactory {
    private static volatile RegistryService registryService;

    /**
     * 单例模式
     *
     * @param registryAddr 注册中心地址
     * @param type 注册中心类型
     * @return 注册中心服务类
     * @throws Exception 异常
     */
    public static RegistryService getInstance(String registryAddr, RegistryType type) throws Exception {
        if (null == registryService) {
            synchronized (RegistryFactory.class) {
                if (null == registryService) {
                    switch (type) {
                        case ZOOKEEPER:
                            registryService = new ZookeeperRegistryService(registryAddr);
                            break;
                        case EUREKA:
                            registryService = new EurekaRegistryService(registryAddr);
                            break;
                    }
                }
            }
        }
        return registryService;
    }
}
