package com.service.provider3.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-30T08:57:26.877Z")

@RestSchema(schemaId = "provider3")
@RequestMapping(path = "/provider3", produces = MediaType.APPLICATION_JSON)
public class Provider3Impl {

    @Autowired
    private Provider3Delegate userProvider3Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProvider3Delegate.helloworld(name);
    }

}
