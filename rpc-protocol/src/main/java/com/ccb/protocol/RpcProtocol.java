package com.ccb.protocol;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class RpcProtocol<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = -2746595262557758287L;

    private MsgHeader header;
    private T body;
}
