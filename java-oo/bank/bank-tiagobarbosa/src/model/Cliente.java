package model;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private static int totalClientes;

    public Cliente(String nome, String cpf, String profissao) {
        totalClientes++;
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public static int getTotalClientes() {
        return totalClientes;
    }
}
