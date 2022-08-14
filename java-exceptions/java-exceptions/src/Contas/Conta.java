package Contas;

import Exceptions.SaldoInsuficienteException;

public abstract class Conta {
    private final int agencia;
    private final int numero;
    private double saldo;

    private static int totalContas;

    public Conta(int agencia, int numero) {
        totalContas++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Saque: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getTotalContas() {
        return totalContas;
    }
}
