package br.com.tiagobarbosa.domain.Util;

public class AutenticacaoUtil {
    private int senha;

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
