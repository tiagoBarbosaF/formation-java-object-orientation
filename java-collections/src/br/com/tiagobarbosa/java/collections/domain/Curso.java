package br.com.tiagobarbosa.java.collections.domain;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
    private static int tempoTotal;

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
        tempoTotal += aula.getTempo();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                ", tempo total='" + getTempoTotal() + "'}";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public static int getTempoTotal() {
        return tempoTotal;
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatricula(int matricula) {
        if (!matriculaParaAluno.containsKey(matricula)) {
            throw new NoSuchElementException("Matricula não encontrada");
        }
        return matriculaParaAluno.get(matricula);
    }
}
