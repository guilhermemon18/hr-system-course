package br.com.guilherme.payrollapi.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{


    public ObjectNotFoundException(String message) {
        super(message);
    }
}
