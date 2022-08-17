package br.com.tiagobarbosa.main;

public class TestString {
    public static void main(String[] args) {
        String nome = "Tiago";

        nome.replace("T", "t");
        System.out.println(nome);

        String nomeTest = nome.replace("T", "t");
        System.out.println(nomeTest);
        String nomeTest2 = nomeTest.toUpperCase();
        System.out.println(nomeTest2);

        System.out.println("----------------------------------------");
        System.out.println("Indexof(a) -> " + nome.indexOf("a"));
        System.out.println("Contains(g) -> " + nome.contains("g"));
        System.out.println("Length(Tiago) -> " + nome.length());
        System.out.println("CharAt(Tiago)");
        for (int i = 0; i < nome.length(); i++) {
            System.out.println("IndexOf(" + i + ") -> " + nome.charAt(i));
        }
    }
}