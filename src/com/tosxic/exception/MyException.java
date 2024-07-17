package com.tosxic.exception;

/*
* 继承Exception类自定义异常
* */
public class MyException extends Exception{
    String message;

    public MyException(String errorMessage) {
        message = errorMessage;
    }

    public String getMessage() {
        return message;
    }

}
