package com.ccb.model;

public class RpcServiceHelper {
    /**
     * 生成服务key
     *
     * @param serviceName 服务名
     * @param serviceVersion 服务版本
     * @return 服务名#服务版本
     */
    public static String buildServiceKey(String serviceName, String serviceVersion) {
        return String.join("#", serviceName, serviceVersion);
    }
}
