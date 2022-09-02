package br.com.tiagobarbosa.java.collections.main;

import br.com.tiagobarbosa.java.collections.domain.Aula;
import br.com.tiagobarbosa.java.collections.domain.Curso;

import java.util.List;

public class TestCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Desbravando coleções Java", "Tiago");
        curso.adiciona(new Aula("Trabalhando com ArrayList", 23));
        curso.adiciona(new Aula("Lista de objetos", 17));
        curso.adiciona(new Aula("Relacionamento com coleções", 20));

        List<Aula> aulas = curso.getAulas();
        System.out.println(aulas);

        aulas.forEach(System.out::println);
    }
}
