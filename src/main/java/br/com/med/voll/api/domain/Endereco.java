package br.com.med.voll.api.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "endereco")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logradoro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;
    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;
}
