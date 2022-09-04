package br.com.tiagobarbosa.java.collections.main;

import br.com.tiagobarbosa.java.collections.domain.Funcionario;
import br.com.tiagobarbosa.java.collections.domain.OrdenaPorIdade;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Funcionario tiago = new Funcionario("Tiago", 30);
        Funcionario john = new Funcionario("John", 20);
        Funcionario bob = new Funcionario("Bob", 34);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(tiago);
        funcionarios.add(john);
        funcionarios.add(bob);

        Iterator<Funcionario> iterator = funcionarios.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}
