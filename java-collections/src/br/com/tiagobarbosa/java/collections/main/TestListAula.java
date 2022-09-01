package br.com.tiagobarbosa.java.collections.main;

import br.com.tiagobarbosa.java.collections.domain.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestListAula {
    public static void main(String[] args) {
        Aula aula1 = new Aula("Trabalhando com ArrayList", 25);
        Aula aula2 = new Aula("Lista de objetos", 15);
        Aula aula3 = new Aula("Relacionamento com coleções", 20);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
    }
}
