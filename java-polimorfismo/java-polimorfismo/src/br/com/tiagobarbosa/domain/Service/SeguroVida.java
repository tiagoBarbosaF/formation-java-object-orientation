package br.com.tiagobarbosa.domain.Service;

import br.com.tiagobarbosa.domain.Interfaces.Tributavel;

public class SeguroVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 30;
    }
}
