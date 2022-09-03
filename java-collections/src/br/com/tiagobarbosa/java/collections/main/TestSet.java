package br.com.tiagobarbosa.java.collections.main;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
//        Set<String> alunos = new HashSet<>();
        Collection<String> alunos = new HashSet<>();
        alunos.add("Tiago Barbosa");
        alunos.add("Peter Mendonça");
        alunos.add("Rakel Moreira");
        alunos.add("Jason Brown");
        alunos.add("Bob Dylan");
        alunos.add("John Snow");
        alunos.add("John Snow");

        alunos.forEach(System.out::println);
        System.out.println();

        List<String> alunosList = new ArrayList<>(alunos);
        alunosList.sort(Comparator.naturalOrder());
        alunosList.forEach(System.out::println);
    }
}
