package com.ccb.serialization.exception;

import java.io.Serial;

public class SerializationException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 5085923605994209402L;

    public SerializationException() {
        super();
    }

    public SerializationException(String msg) {
        super(msg);
    }

    public SerializationException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public SerializationException(Throwable cause) {
        super(cause);
    }
}
