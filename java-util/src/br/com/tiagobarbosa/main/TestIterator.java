package br.com.tiagobarbosa.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tiago");
        names.add("Peter");
        names.add("Rakel");
        names.add("Bob");
        names.add("John");
        names.add("Maria");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
