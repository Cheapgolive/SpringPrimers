package com.cheapgolive.devops.springbootwebcloud.api;

import com.cheapgolive.devops.springbootwebcloud.model.Person;
import org.springframework.web.bind.annotation.*;

/**
 * Created by  cheapgolive-devops on 9/26/2017.
 */
@RestController
@RequestMapping("/api")
public class PersonController {

    @GetMapping
    public String hello(){

        return "Hello";
    }

    @PostMapping
    public String getName(@RequestBody Person person){

        return person.getName();
    }
}
