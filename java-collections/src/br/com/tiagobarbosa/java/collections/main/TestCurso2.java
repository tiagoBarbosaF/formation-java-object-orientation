package br.com.tiagobarbosa.java.collections.main;

import br.com.tiagobarbosa.java.collections.domain.Aula;
import br.com.tiagobarbosa.java.collections.domain.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCurso2 {
    public static void main(String[] args) {
        Curso curso = new Curso("Desbravando coleções Java", "Tiago");
        curso.adiciona(new Aula("Trabalhando com ArrayList", 23));
        curso.adiciona(new Aula("Lista de objetos", 17));
        curso.adiciona(new Aula("Relacionamento com coleções", 20));

        List<Aula> aulas = curso.getAulas();
        System.out.println(aulas);

        List<Aula> aulasOrdenadas = new ArrayList<>(aulas);
        System.out.println();
        System.out.println("Tempo total de aulas: " + Curso.getTempoTotal());
        System.out.println("\nAulas ordenadas pelo titulo");
        Collections.sort(aulasOrdenadas);
        System.out.println(aulasOrdenadas);
        System.out.println("\nImprimindo a referencia curso:");
        System.out.println(curso);
    }
}
