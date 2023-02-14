package br.com.med.voll.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @PostMapping
    @CrossOrigin
    public void cadastrar(@RequestBody String json){
        System.out.println(json);
    }

    @GetMapping
    @CrossOrigin
    public String status(){
        return "Api /medicos Funcionando!";
    }
}
