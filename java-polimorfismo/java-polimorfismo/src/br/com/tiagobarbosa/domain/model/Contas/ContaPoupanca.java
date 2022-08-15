package br.com.tiagobarbosa.domain.model.Contas;

import br.com.tiagobarbosa.domain.model.Pessoas.Cliente;
import br.com.tiagobarbosa.domain.model.Base.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }
}
