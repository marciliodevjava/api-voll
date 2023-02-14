package br.com.med.voll.api.controller;

import br.com.med.voll.api.paciente.PacienteDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @PostMapping
    @CrossOrigin
    public void cadastrat(@RequestBody PacienteDto pacienteDto){
        System.out.println("Dados recebidos: " + pacienteDto);
    }
}
