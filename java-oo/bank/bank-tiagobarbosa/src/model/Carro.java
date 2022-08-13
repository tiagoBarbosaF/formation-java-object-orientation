package model;

public class Carro {
    private final int ano;
    private final String modelo;
    private final double preco;
    private static int totalCarros;

    public Carro(int ano, String modelo, double preco) {
        totalCarros++;
        if (ano >= 1891) {
            this.ano = ano;
        } else {
            System.out.println("O ano informado está inválido. Usaremos 2017");
            this.ano = 2017;
        }

        if (modelo != null) {
            this.modelo = modelo;
        } else {
            System.out.println("O modelo não foi informado. Por isso usaremos Uno!");
            this.modelo = "Uno";
        }

        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não é válido. Usaremos 40.000,00!");
            this.preco = 40000.0;
        }
    }

    public Carro(String modelo, double preco) {
        this(2017, modelo, preco);
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public static int getTotalCarros() {
        return totalCarros;
    }
}
