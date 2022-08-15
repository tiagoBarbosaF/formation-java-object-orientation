package br.com.tiagobarbosa.domain.model.Contas;

import br.com.tiagobarbosa.domain.Interfaces.Tributavel;
import br.com.tiagobarbosa.domain.model.Base.Conta;
import br.com.tiagobarbosa.domain.model.Pessoas.Cliente;

public class ContaCorrente extends Conta implements Tributavel {

    private final double percentualTributacao = 0.05;
    public ContaCorrente(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public boolean saca(double valor) {
         return super.saca(valor + 0.2);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * percentualTributacao;
    }

    public double getPercentualTributacao() {
        return percentualTributacao;
    }
}
