package br.com.tiagobarbosa.java.collections.domain;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private static int tempoTotal;

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
        tempoTotal += aula.getTempo();
    }

//    public int getTempoTotal() {
//        int tempoTotal = 0;
//        for (Aula aula :
//                aulas) {
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;
//    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                ", tempo total='" + getTempoTotal() + "'}";
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
}
