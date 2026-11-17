package com.demo.uersfservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uersf")
public class UersfController {


    @GetMapping(value= "/{userid}")
    public Uersf getUersf(@PathVariable ("userid") String userid){
    Uersf uersf = new Uersf("15","Pibu","Banganaga");
     return uersf;
    }
}
