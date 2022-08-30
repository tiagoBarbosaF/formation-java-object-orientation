package br.com.tiagobarbosa.java.io.main;

import br.com.tiagobarbosa.java.io.domain.ContaCorrente;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contaCorrente.bin"));
        ContaCorrente contaCorrente = (ContaCorrente) ois.readObject();
        ois.close();
        System.out.printf("Conta Corrente:%n - Agência: %04d%n - Número: %08d%n - Titular: %s%n - Profissão: " +
                        "%s%n - Saldo: %.2f%n",
                contaCorrente.getAgencia(), contaCorrente.getNumero(), contaCorrente.getTitular().getNome(),
                contaCorrente.getTitular().getProfissao(), contaCorrente.getSaldo());
    }
}
