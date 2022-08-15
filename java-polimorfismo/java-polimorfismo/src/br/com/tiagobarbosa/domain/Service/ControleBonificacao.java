package br.com.tiagobarbosa.domain.Service;

import br.com.tiagobarbosa.domain.model.Base.Funcionario;

public class ControleBonificacao {
    private double soma;

    public void registra(Funcionario funcionario) {
        this.soma += funcionario.getBonificacao();
    }

    public double getSoma() {
        return soma;
    }
}
