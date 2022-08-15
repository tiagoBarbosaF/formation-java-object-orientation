package br.com.tiagobarbosa.domain.Interfaces;

public interface Autenticavel {
    void setSenha(int senha);

    boolean autentica(int senha);
}
