package com.anthonytimotheou.model;

/**
 * Created by anthony on 17/05/2015.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
