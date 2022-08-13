package model.Base;

import Interfaces.Tributavel;

public class CalcularImposto {
    private double totalImpostos;

    public void registra(Tributavel tributavel) {
        this.totalImpostos += tributavel.getValorImposto();
    }

    public double getTotalImpostos() {
        return totalImpostos;
    }
}
