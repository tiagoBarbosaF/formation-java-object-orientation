package br.com.tiagobarbosa.main;

import br.com.tiagobarbosa.domain.Contas.ContaCorrente;

public class TestReferences {
    public static void main(String[] args) {
        ContaCorrente[] contaCorrentes = new ContaCorrente[5];

        for (int i = 0; i < contaCorrentes.length; i++) {
            contaCorrentes[i] = new ContaCorrente(33, i * 10);
        }

        for (int i = 0; i < contaCorrentes.length; i++) {
            System.out.println(
                    "Conta corrente [" + i + "]: -> Número: 33" + contaCorrentes[i].getNumero() + " Agência: " +
                            contaCorrentes[i].getAgencia());
        }
    }
}
