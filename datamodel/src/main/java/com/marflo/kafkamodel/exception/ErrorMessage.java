package com.marflo.kafkamodel.exception;

public enum ErrorMessage {

    UNEXPECTED_EXCEPTION(100, "An unexpected exception has occured");

    private final int code;
    private final String description;

    ErrorMessage(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + ": " + description;
    }
}
