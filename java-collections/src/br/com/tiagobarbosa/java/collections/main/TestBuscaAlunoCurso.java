package br.com.tiagobarbosa.java.collections.main;

import br.com.tiagobarbosa.java.collections.domain.Aluno;
import br.com.tiagobarbosa.java.collections.domain.Aula;
import br.com.tiagobarbosa.java.collections.domain.Curso;

public class TestBuscaAlunoCurso {
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

        System.out.println("Aluno com matrícula 4367");
        Aluno aluno = curso.buscaMatricula(1111);
        System.out.printf("Aluno: %s%n", aluno);
    }
}
