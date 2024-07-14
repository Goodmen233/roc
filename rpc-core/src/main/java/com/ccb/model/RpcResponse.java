package com.ccb.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * rpc请求返回信息
 */
@Data
public class RpcResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 963990330732518010L;

    private Object data; // 请求结果

    private String message; // 错误信息

}
