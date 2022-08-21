package br.com.tiagobarbosa.main;

import br.com.tiagobarbosa.domain.Contas.Conta;
import br.com.tiagobarbosa.domain.Contas.ContaCorrente;
import br.com.tiagobarbosa.domain.Contas.ContaPoupanca;

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

        System.out.println("---------------------------------------");

        Object[] references = new Object[5];
        Conta cc1 = new ContaCorrente(11, 22);
        references[0] = cc1;
        Conta cc2 = new ContaPoupanca(11, 55);
        references[1] = cc2;
        for (Object o : references) {
            System.out.println(o);
        }
        for (Object reference : references) {
            if (reference == null) {
                break;
            }
            System.out.println("Número: " + ((Conta) reference).getNumero() + " Agência: " +
                    ((Conta) reference).getAgencia());
        }
    }
}
