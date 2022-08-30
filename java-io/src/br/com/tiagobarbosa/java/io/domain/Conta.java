package br.com.tiagobarbosa.java.io.domain;

import java.io.Serializable;

public abstract class Conta implements Serializable {
    private static final long serialVersionUID = 1L;
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente titular;
//    private transient Cliente titular;

    private static int totalContas;

    public Conta(int agencia, int numero, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (saca(valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    public static void setTotalContas(int totalContas) {
        Conta.totalContas = totalContas;
    }
}
