package br.com.tiagobarbosa.java.tdd.service;

import br.com.tiagobarbosa.java.tdd.domain.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {
    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            throw new IllegalArgumentException("Funcionários com salário maior que R$ 10.000,00 não recebem bônus.");
        }
        return valor.setScale(2, RoundingMode.HALF_UP);
    }
}
