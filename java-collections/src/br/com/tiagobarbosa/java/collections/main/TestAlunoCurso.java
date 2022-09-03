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

        curso.matricula(new Aluno("Tiago Barbosa", 1232));
        curso.matricula(new Aluno("Peter Mendonça", 4367));
        curso.matricula(new Aluno("Rakel Moreira", 4679));

        List<Aluno> alunosOrdenados = new ArrayList<>(curso.getAlunos());
        alunosOrdenados.sort(Comparator.naturalOrder());
        System.out.println("Todos os alunos");
        alunosOrdenados.forEach(System.out::println);
    }
}
