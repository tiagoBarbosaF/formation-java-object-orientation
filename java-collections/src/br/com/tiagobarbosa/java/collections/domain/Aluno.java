package br.com.tiagobarbosa.java.collections.domain;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        if (nome == null){
            throw new NullPointerException("Nome não pode ser vazio.");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula);
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public int compareTo(Aluno outroAluno) {
        return this.nome.compareTo(outroAluno.nome);
    }
}
