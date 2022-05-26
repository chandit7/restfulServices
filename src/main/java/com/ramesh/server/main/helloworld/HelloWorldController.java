package com.ramesh.server.main.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller

@RestController
public class HelloWorldController {
//Using get method to and hello-world as URI
    //@RequestMapping(method = RequestMethod.GET,path="hello-world")
    @GetMapping(path="/hello-world")
    public String helloWorld(){
        return "Hello world - This is my demo Rest-ful service";
    }
    @GetMapping(path="/hello-world-bean")
    public HelloworldBean HelloworldBean(){
        return new HelloworldBean("hello world");

    }
    //passing a path variable
    @GetMapping(path="/hello-world/{name}")
    public HelloworldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloworldBean(String.format("Hello world path, %s",name));
    }

}
