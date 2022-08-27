package br.com.tiagobarbosa.main;

import br.com.tiagobarbosa.domain.Contas.Conta;
import br.com.tiagobarbosa.domain.Contas.ContaCorrente;
import br.com.tiagobarbosa.domain.Contas.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestOrderList {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 444);
        cc1.deposita(100);

        Conta cc2 = new ContaPoupanca(22, 111);
        cc2.deposita(200);

        Conta cc3 = new ContaCorrente(33, 666);
        cc3.deposita(350);

        Conta cc4 = new ContaPoupanca(44, 333);
        cc4.deposita(120);

        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cc4);

        for (Conta conta :
                contas) {
            System.out.println(conta);
        }

        ContaComparator comparator = new ContaComparator();

        contas.sort(comparator);

        System.out.println("\n----------------------------------------------\n");

        for (Conta conta :
                contas) {
            System.out.println(conta);
        }
    }
}

class ContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getNumero(), c2.getNumero());
    }
}
