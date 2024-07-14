package com.ccb.serialization.factory;

import com.ccb.serialization.RpcSerialization;
import com.ccb.serialization.enums.SerializationTypeEnum;
import com.ccb.serialization.impl.HessianSerialization;
import com.ccb.serialization.impl.JsonSerialization;

public class SerializationFactory {
    public static RpcSerialization getRpcSerialization(int value) {
        SerializationTypeEnum serializationType = SerializationTypeEnum.getValueOrDefaultJson(value);

        return switch (serializationType) {
            case HESSIAN -> new HessianSerialization();
            case JSON -> new JsonSerialization();
            default -> throw new IllegalArgumentException("serialization type is illegal, " + serializationType);
        };
    }
}
