package br.com.tiagobarbosa.domain.Contas;

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
