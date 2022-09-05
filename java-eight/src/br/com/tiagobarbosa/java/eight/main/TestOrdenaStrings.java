package br.com.tiagobarbosa.java.eight.main;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparingInt;
import static java.util.Comparator.naturalOrder;

public class TestOrdenaStrings {
    public static void main(String[] args) {
        List<String> textos = new ArrayList<>();
        textos.add("Textos de exemplo");
        textos.add("Consoles da nova geração");
        textos.add("Alura");


        System.out.println(textos);
//        textos.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        textos.sort(comparingInt(String::length)); // Comparando por tamanho da string
        System.out.println(textos);
        textos.sort(naturalOrder()); // Comparando de modo alfabético
        System.out.println(textos);
        System.out.println();

        textos.forEach(texto -> System.out.printf("Texto: %s%n", texto));
        System.out.println();
        textos.forEach(System.out::println);
        System.out.println();

        textos.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(textos);
        System.out.println();

        new Thread(() -> System.out.println("Executando um Runnable")).start();
    }
}