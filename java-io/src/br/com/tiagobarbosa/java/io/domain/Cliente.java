package br.com.tiagobarbosa.java.io.domain;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String nome;
    private String cpf;
    private String profissao;
    private static int totalClientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public static int getTotalClientes() {
        return totalClientes;
    }

    public static void setTotalClientes(int totalClientes) {
        Cliente.totalClientes = totalClientes;
    }
}
