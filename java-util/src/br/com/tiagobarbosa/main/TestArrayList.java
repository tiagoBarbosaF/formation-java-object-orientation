package br.com.tiagobarbosa.main;

import br.com.tiagobarbosa.domain.Contas.Conta;
import br.com.tiagobarbosa.domain.Contas.ContaCorrente;
import br.com.tiagobarbosa.domain.Contas.ContaPoupanca;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Conta> list = new ArrayList<>();

        list.add(new ContaCorrente(22, 211));
        list.add(new ContaPoupanca(22, 222));
        ContaPoupanca cc3 = new ContaPoupanca(22, 222);

        System.out.println("Size -> " + list.size());
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("---------------------");
        System.out.println("Remove one count");
        list.remove(0);
        System.out.println("Size -> " + list.size());
        for (Conta conta :
                list) {
            System.out.println(conta);
        }
        System.out.println("---------------------");
        System.out.println("Contas já existe? " + list.contains(cc3));

    }
}
