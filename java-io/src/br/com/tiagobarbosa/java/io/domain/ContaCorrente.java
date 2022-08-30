package br.com.tiagobarbosa.java.io.domain;

public class ContaCorrente extends Conta {

    private final double percentualTributacao = 0.05;
    public ContaCorrente(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public boolean saca(double valor) {
         return super.saca(valor + 0.2);
    }
}
