package com.venturini.model_spring.infrastructure.exceptions;

public class ConflictException extends RuntimeException {

    public ConflictException(String menssagem) {
        super(menssagem);
    }

    public ConflictException(String mensssagem, Throwable throwable) {
        super(mensssagem, throwable);
    }
}
