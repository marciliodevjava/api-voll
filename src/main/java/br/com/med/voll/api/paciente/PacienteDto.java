package br.com.med.voll.api.paciente;

import br.com.med.voll.api.endereco.Endereco;

public record PacienteDto(String nome, String email, String telefone, String cpf, Endereco endereco) {
}
