package br.com.tiagobarbosa.domain.model.Funcionarios;

import br.com.tiagobarbosa.domain.model.Base.Funcionario;

public class Desenvolvedor extends Funcionario {

    @Override
    public double getBonificacao() {
        return (super.getSalario() * 0.3);
    }
}
