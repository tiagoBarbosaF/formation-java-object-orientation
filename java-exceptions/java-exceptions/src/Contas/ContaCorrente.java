package Contas;

import Exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
         super.saca(valor + 0.2);
    }

}
