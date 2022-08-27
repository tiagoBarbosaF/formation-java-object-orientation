package br.com.tiagobarbosa.main;

import br.com.tiagobarbosa.domain.Contas.Conta;
import br.com.tiagobarbosa.domain.Contas.ContaCorrente;
import br.com.tiagobarbosa.domain.Contas.ContaPoupanca;
import br.com.tiagobarbosa.domain.Pessoas.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestLambdas {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 444);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Tiago");
        cc1.setTitular(clienteCC1);
        cc1.deposita(100);

        Conta cc2 = new ContaPoupanca(22, 111);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Peter");
        cc2.setTitular(clienteCC2);
        cc2.deposita(200);

        Conta cc3 = new ContaCorrente(33, 666);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Rakel");
        cc3.setTitular(clienteCC3);
        cc3.deposita(350);

        Conta cc4 = new ContaPoupanca(44, 333);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Bob");
        cc4.setTitular(clienteCC4);
        cc4.deposita(120);

        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cc4);

        contas.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
        contas.sort((c1, c2) -> {
            String nome1 = c1.getTitular().getNome();
            String nome2 = c2.getTitular().getNome();
            return nome1.compareTo(nome2);
        });
        contas.forEach((conta) -> System.out.println(conta + ", Titular: " + conta.getTitular().getNome()));
    }
}