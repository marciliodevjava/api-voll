package br.com.med.voll.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "hello")
public class HelloController {


    @GetMapping
    @CrossOrigin
    public String olaMundo(){
        return "Hello World! SpringBoot!!!";
    }
    @GetMapping("/status")
    @CrossOrigin
    public String status(){
        return "Api Funcionando!";
    }
}
