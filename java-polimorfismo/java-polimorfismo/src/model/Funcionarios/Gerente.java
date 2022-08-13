package model.Funcionarios;

import Interfaces.Autenticavel;
import Util.AutenticacaoUtil;
import model.Base.Funcionario;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;
    private AutenticacaoUtil autenticacaoUtil;

    public Gerente() {
        this.autenticacaoUtil = new AutenticacaoUtil();
    }

    @Override
    public boolean autentica(int senha) {
        return autenticacaoUtil.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        autenticacaoUtil.setSenha(senha);
    }

    public double getBonificacao() {
        return super.getSalario();
    }
}
