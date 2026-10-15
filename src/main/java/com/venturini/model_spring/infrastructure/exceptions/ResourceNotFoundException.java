package com.venturini.model_spring.infrastructure.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String menssagem) {
        super(menssagem);
    }

    public ResourceNotFoundException(String menssagem, Throwable throwable) {
        super(menssagem, throwable);
    }
}
