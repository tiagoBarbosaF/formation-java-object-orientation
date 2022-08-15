package br.com.tiagobarbosa.main;

import br.com.tiagobarbosa.domain.Contas.ContaCorrente;
import br.com.tiagobarbosa.domain.Exceptions.SaldoInsuficienteException;

public class TesteContasSaldoException {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(111, 2222);
        contaCorrente.deposita(1000);
        try {
            contaCorrente.saca(1010);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Saldo: " + contaCorrente.getSaldo());
    }
}
