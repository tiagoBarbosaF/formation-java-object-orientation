package br.com.tiagobarbosa.java.collections.main;

import java.util.ArrayList;
import java.util.Collections;

public class TestArayList {
    public static void main(String[] args) {
        String class01 = "Trabalhando com ArrayList";
        String class02 = "Lista de objetos";
        String class03 = "Relacionamento com coleções";

        ArrayList<String> classes = new ArrayList<>();
        classes.add(class01);
        classes.add(class02);
        classes.add(class03);

        System.out.println(classes);

//        classes.remove(0);
//        System.out.println(classes);

        for (String clazz :
                classes) {
            System.out.println("Class: " + clazz);
        }

        Collections.sort(classes);
        System.out.println(classes);
        System.out.println("For each class:");
        classes.forEach(clazz -> System.out.printf(" - %s%n", clazz));
    }
}