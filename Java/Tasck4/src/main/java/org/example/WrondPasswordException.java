package org.example;

public class WrondPasswordException extends RuntimeException {
    public WrondPasswordException() {
    }

    ;

    public WrondPasswordException(String messenger) {
        super(messenger);

    }

    ;
}
