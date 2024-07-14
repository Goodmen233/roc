package com.ccb.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * rpc请求信息
 */
@Data
public class RpcRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = -3848908652426518634L;

    private String serviceVersion;
    private String className;
    private String methodName;
    private Object[] params;
    private Class<?>[] parameterTypes;
}
