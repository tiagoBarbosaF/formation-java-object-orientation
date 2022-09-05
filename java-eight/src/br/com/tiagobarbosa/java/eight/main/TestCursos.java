package br.com.tiagobarbosa.java.eight.main;

import br.com.tiagobarbosa.java.eight.domain.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 43));
        cursos.add(new Curso("JavaScript", 130));
        cursos.add(new Curso("Java", 134));
        cursos.add(new Curso("C++", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
        cursos.forEach(
                curso -> System.out.printf("Curso: %s, Quantidade alunos: %d%n", curso.getNome(), curso.getAlunos()));
        System.out.println();

        System.out.println("\n--- Using Streams ---");
        cursos.stream().filter(curso -> curso.getAlunos() >= 100).forEach(
                curso -> System.out.printf("Curso: %s, Quantidade alunos: %d%n", curso.getNome(), curso.getAlunos()));
        System.out.println();

        System.out.println("------------------");
        int totalAlunos = cursos.stream().mapToInt(Curso::getAlunos).sum();
        System.out.printf("Total de alunos dos cursos: %d", totalAlunos);
        System.out.println();

        System.out.println("----- Cursos ---------");
        cursos.stream().map(Curso::getNome).forEach(curso -> System.out.printf(" - %s%n", curso));
    }
}
