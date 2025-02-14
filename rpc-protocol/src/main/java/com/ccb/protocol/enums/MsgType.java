package com.ccb.protocol.enums;

import lombok.Getter;

@Getter
public enum MsgType {
    /**
     * 请求
     */
    REQUEST(1),
    /**
     * 响应
     */
    RESPONSE(2),
    /**
     * 心跳检测
     */
    HEARTBEAT(3);

    private final int type;

    MsgType(int type) {
        this.type = type;
    }

    public static MsgType findByType(int type) {
        for (MsgType msgType : MsgType.values()) {
            if (msgType.getType() == type) {
                return msgType;
            }
        }
        return null;
    }
}
