package com.ccb.configuration;

import com.ccb.enums.RegistryType;
import com.ccb.factory.RegistryFactory;
import com.ccb.properties.RpcProperties;
import com.ccb.provider.RpcProvider;
import com.ccb.service.RegistryService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@EnableConfigurationProperties(RpcProperties.class)
public class RpcConfiguration {
    @Resource
    private RpcProperties rpcProperties;

    @Bean
    public RpcProvider init() throws Exception {
        RegistryType type = RegistryType.valueOf(rpcProperties.getRegistryType());
        RegistryService serviceRegistry = RegistryFactory.getInstance(rpcProperties.getRegistryAddress(), type);
        return new RpcProvider(rpcProperties.getServicePort(), serviceRegistry);

    }
}
