package model;

import Interfaces.Autenticavel;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autenticavel autenticavel) {
        boolean autentica = autenticavel.autentica(this.senha);
        System.out.println(autentica ? "Autorizado a acessar o sistema." :
                "Sem autorização para acessar o sistema, entre em contato com a empresa.");
    }
}
