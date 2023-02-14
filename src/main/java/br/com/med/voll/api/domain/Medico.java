package br.com.med.voll.api.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "medico")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
    @OneToMany
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
}
