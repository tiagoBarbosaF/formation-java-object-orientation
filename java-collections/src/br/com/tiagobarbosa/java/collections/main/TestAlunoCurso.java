package br.com.tiagobarbosa.java.collections.main;

import br.com.tiagobarbosa.java.collections.domain.Aluno;
import br.com.tiagobarbosa.java.collections.domain.Aula;
import br.com.tiagobarbosa.java.collections.domain.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestAlunoCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Desbravando coleções Java", "Tiago");
        curso.adiciona(new Aula("Trabalhando com ArrayList", 23));
        curso.adiciona(new Aula("Lista de objetos", 17));
        curso.adiciona(new Aula("Relacionamento com coleções", 20));

        Aluno tiago_barbosa = new Aluno("Tiago Barbosa", 1232);
        Aluno peter_mendonca = new Aluno("Peter Mendonça", 4367);
        Aluno rakel_moreira = new Aluno("Rakel Moreira", 4679);
        curso.matricula(tiago_barbosa);
        curso.matricula(peter_mendonca);
        curso.matricula(rakel_moreira);

        List<Aluno> alunosOrdenados = new ArrayList<>(curso.getAlunos());
        alunosOrdenados.sort(Comparator.naturalOrder());
        System.out.println("Todos os alunos");
        alunosOrdenados.forEach(System.out::println);
        System.out.println();

        boolean estaMatriculado = curso.estaMatriculado(tiago_barbosa);
        System.out.printf("O aluno '%s' esta matriculado? %s%n", tiago_barbosa.getNome(), estaMatriculado);

        Aluno tiagoTest = new Aluno("Tiago Barbosa", 1232);
        System.out.println(tiago_barbosa.equals(tiagoTest));
        System.out.println(tiago_barbosa.hashCode() == tiagoTest.hashCode());
    }
}
