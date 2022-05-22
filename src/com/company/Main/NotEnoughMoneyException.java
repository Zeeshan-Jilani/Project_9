package com.company.Main;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String errorMessage) {
        super(errorMessage);
    }
}
