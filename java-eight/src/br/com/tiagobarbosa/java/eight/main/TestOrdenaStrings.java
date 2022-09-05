package br.com.tiagobarbosa.java.eight.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestOrdenaStrings {
    public static void main(String[] args) {
        List<String> textos = new ArrayList<>();
        textos.add("Textos de exemplo");
        textos.add("Consoles da nova geração");
        textos.add("Alura");


        System.out.println(textos);
        textos.sort(Comparator.comparingInt(String::length)); // Comparando por tamanho da string
        System.out.println(textos);
        textos.sort(Comparator.naturalOrder()); // Comparando de modo alfabético
        System.out.println(textos);
        System.out.println();

        textos.forEach(texto -> System.out.printf("Texto: %s%n", texto));
        System.out.println();
        textos.forEach(System.out::println);
    }
}