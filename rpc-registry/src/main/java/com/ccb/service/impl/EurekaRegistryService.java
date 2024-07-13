package com.ccb.service.impl;

import com.ccb.model.ServiceMeta;
import com.ccb.service.RegistryService;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class EurekaRegistryService implements RegistryService {

    public EurekaRegistryService(String registryAddr) {
        // TODO 注册中心
        log.info("EurekaRegistryService init, address:{}", registryAddr);
    }

    @Override
    public void register(ServiceMeta serviceMeta) throws Exception {

    }

    @Override
    public void unRegister(ServiceMeta serviceMeta) throws Exception {

    }

    @Override
    public ServiceMeta discovery(String serviceName, int invokerHashCode) throws Exception {
        return null;
    }

    @Override
    public void destroy() throws IOException {

    }
}
