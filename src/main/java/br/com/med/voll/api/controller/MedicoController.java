package br.com.med.voll.api.controller;

import br.com.med.voll.api.medico.MedicoDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medico")
public class MedicoController {

    @PostMapping
    @CrossOrigin
    public void cadastrar(@RequestBody MedicoDto medicoDto){
        System.out.println(medicoDto);
    }

    @GetMapping
    @CrossOrigin
    public String status(){
        return "Api /medicos Funcionando!";
    }
}
