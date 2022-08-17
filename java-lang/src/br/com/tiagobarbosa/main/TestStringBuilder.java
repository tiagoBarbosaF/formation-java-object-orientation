package br.com.tiagobarbosa.main;

public class TestStringBuilder {
    public static void main(String[] args) {
        System.out.println("========= String builder =========");
        StringBuilder builder = new StringBuilder("Por favor");
        builder.append(",");
        builder.append(" podem me");
        builder.append(" ajudar?");
        builder.append(" Estou com dúvidas");
        builder.append(" sobre alguns itens do carro.");
        System.out.println(builder);
    }
}
