package br.com.tiagobarbosa.java.collections.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> numbersArrayList = new ArrayList<>();
        List<Integer> numbersLinkedList = new LinkedList<>();
        int quantityElements = 1_000_000;
        long timeArrayList = insertElementsIn(numbersArrayList, quantityElements);
        long timeLinkedList = insertElementsIn(numbersLinkedList, quantityElements);

        System.out.println("Inserting in ArrayList took time: " + timeArrayList);
        System.out.println("Inserting in LinkedList took time: " + timeLinkedList);

        timeArrayList = removeFirstElements(numbersArrayList);
        timeLinkedList = removeFirstElements(numbersLinkedList);
        System.out.println("Removing of ArrayList took time: " + timeArrayList);
        System.out.println("Removing of LinkedList took time: " + timeLinkedList);
    }

    private static long insertElementsIn(List<Integer> numbers, int quantity) {
        long begin = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            numbers.add(i);
        }
        long end = System.currentTimeMillis();
        return end - begin;
    }

    private static long removeFirstElements(List<Integer> numbers) {
        long begin = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            numbers.remove(0);
        }

        long end = System.currentTimeMillis();
        return end - begin;
    }
}
