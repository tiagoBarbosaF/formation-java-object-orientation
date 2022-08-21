package br.com.tiagobarbosa.domain.Contas;

public class ContaCorrente extends Conta {

    private final double percentualTributacao = 0.05;
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
         return super.saca(valor + 0.2);
    }

    public double getPercentualTributacao() {
        return percentualTributacao;
    }

    @Override
    public String toString() {
        return "ContaCorrente: " + super.toString();
    }
}
