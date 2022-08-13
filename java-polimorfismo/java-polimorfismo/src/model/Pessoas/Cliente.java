package model.Pessoas;

import Interfaces.Autenticavel;
import Util.AutenticacaoUtil;

public class Cliente implements Autenticavel {
    private String nome;
    private String cpf;
    private String profissao;
    private AutenticacaoUtil autenticacaoUtil;
    private static int totalClientes;

    public Cliente(String nome, String cpf, String profissao) {
        totalClientes++;
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.autenticacaoUtil = new AutenticacaoUtil();
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

    @Override
    public void setSenha(int senha) {
        this.autenticacaoUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticacaoUtil.autentica(senha);
    }
}
