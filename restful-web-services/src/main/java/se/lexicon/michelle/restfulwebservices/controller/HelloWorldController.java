package se.lexicon.michelle.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import se.lexicon.michelle.restfulwebservices.entity.HelloWorldBean;

//Controller
@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello world";
    }

    //hello-world-bean
    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldsBean(){
        return new HelloWorldBean("Hello world");
    }

    ///hello-world/path-variable/in28minutes
    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World %s", name));
    }
}
