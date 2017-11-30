package com.service.provider3.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProvider3 {

        Provider3Delegate provider3Delegate = new Provider3Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = provider3Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}