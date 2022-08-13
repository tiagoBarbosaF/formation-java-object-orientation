package model;

public class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente titular;

    private static int totalContas;

    public Conta(int agencia, int numero, Cliente titular) {
        totalContas++;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public void deposita(double valor) {
        saldo += valor;
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
            deposita(destino.saldo);
            return true;
        }
        return false;
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

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotalContas() {
        return totalContas;
    }
}
