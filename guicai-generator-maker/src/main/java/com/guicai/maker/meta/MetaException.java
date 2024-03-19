package com.guicai.maker.meta;

/**
 * @Author ${雷电影}
 * @Version 1.0
 */
public class MetaException extends RuntimeException {

    public MetaException(String message) {
        super(message);
    }

    public MetaException(String message, Throwable cause) {
        super(message, cause);
    }
}