package com.ccb.service;

import com.ccb.model.ServiceMeta;

import java.io.IOException;

public interface RegistryService {

    /**
     * 注册
     * @param serviceMeta 服务信息
     * @throws Exception 异常
     */
    void register(ServiceMeta serviceMeta) throws Exception;

    /**
     * 注销
     * @param serviceMeta 服务信息
     * @throws Exception 异常
     */
    void unRegister(ServiceMeta serviceMeta) throws Exception;

    /**
     * 发现服务策略
     * @param serviceName 服务名
     * @param invokerHashCode hash
     * @return 服务信息
     * @throws Exception 异常
     */
    ServiceMeta discovery(String serviceName, int invokerHashCode) throws Exception;

    /**
     * 销毁
     * @throws IOException io
     */
    void destroy() throws IOException;
}
