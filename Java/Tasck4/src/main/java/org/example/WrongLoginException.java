package org.example;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException(){};
    public WrongLoginException(String massenger){
        super(massenger);
    }

}
