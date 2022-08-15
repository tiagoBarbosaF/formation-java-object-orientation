package br.com.tiagobarbosa.domain.model.Pessoas;

import br.com.tiagobarbosa.domain.Interfaces.Autenticavel;
import br.com.tiagobarbosa.domain.Util.AutenticacaoUtil;

public class Fiscal implements Autenticavel {
    private AutenticacaoUtil autenticacaoUtil;

    public Fiscal() {
        this.autenticacaoUtil = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        autenticacaoUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return autenticacaoUtil.autentica(senha);
    }
}
