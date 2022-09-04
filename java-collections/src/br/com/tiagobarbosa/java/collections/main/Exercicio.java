package br.com.tiagobarbosa.java.collections.main;

import java.util.HashMap;
import java.util.Map;

public class Exercicio {
    public static void main(String[] args) {
        HashMap<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Tiago");
        pessoas.put(35, "Bob");
        pessoas.put(32, "Maria");
        pessoas.put(13, "Peter");
        pessoas.put(65, "John");
        pessoas.put(42, "Sarah");

        pessoas.forEach((idade, nome) -> System.out.printf("Nome: %s, Idade: %d%n", nome, idade));

        System.out.println("\n\n-----------------------------------------\n\n");

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        nomesParaIdade.keySet().forEach(System.out::println);
        System.out.println();
        nomesParaIdade.values().forEach(System.out::println);
        System.out.println();
        nomesParaIdade.entrySet().forEach(System.out::println);
    }
}
