package com.ccb.serialization.enums;

import lombok.Getter;

@Getter
public enum SerializationTypeEnum {
    JSON(0x10), HESSIAN(0x20);

    private final int value;

    SerializationTypeEnum(int value) {
        this.value = value;
    }

    /**
     * 获取序列化方式，没有则用JSON
     */
    public static SerializationTypeEnum getValueOrDefaultJson(int value) {
        for (SerializationTypeEnum item : SerializationTypeEnum.values()) {
            if (item.value == value) {
                return item;
            }
        }
        return JSON;
    }
}
