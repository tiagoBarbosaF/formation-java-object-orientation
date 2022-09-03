package br.com.tiagobarbosa.java.collections.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestPerformance {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();

        long begin = System.currentTimeMillis();
        for (int i = 0; i < 50_000; i++) {
            numbers.add(i);
        }

        for (Integer number :
                numbers) {
            numbers.contains(number);
        }
        long end = System.currentTimeMillis();
        long tempoExecucao = end - begin;
        System.out.println("Tempo gasto usando ArrayList: " + tempoExecucao);
        System.out.println();

        Collection<Integer> numbers2 = new HashSet<>();

        long begin2 = System.currentTimeMillis();
        for (int i = 0; i < 50_000; i++) {
            numbers2.add(i);
        }

        for (Integer number2 :
                numbers2) {
            numbers2.contains(number2);
        }
        long end2 = System.currentTimeMillis();
        long tempoExecucao2 = end2 - begin2;
        System.out.println("Tempo gasto usando HasSet: " + tempoExecucao2);
    }
}
