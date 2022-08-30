package br.com.tiagobarbosa.java.io.main;

import br.com.tiagobarbosa.java.io.domain.Cliente;
import br.com.tiagobarbosa.java.io.domain.ContaCorrente;

import java.io.*;

public class TestSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        String name = "Tiago Barbosa";
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.bin"));
//        oos.writeObject(name);
//        oos.close();

        Cliente cliente = new Cliente();
        cliente.setNome("Tiago Barbosa");
        cliente.setCpf("11213131231231");
        cliente.setProfissao("Developer");

        ContaCorrente contaCorrente = new ContaCorrente(22, 345, cliente);
        contaCorrente.deposita(540.35);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contaCorrente.bin"));
        oos.writeObject(contaCorrente);
        oos.close();
    }
}
