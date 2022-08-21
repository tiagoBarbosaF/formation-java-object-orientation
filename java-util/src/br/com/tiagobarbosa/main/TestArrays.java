package br.com.tiagobarbosa.main;

public class TestArrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * i;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Numbers position[" + i + "] -> " + numbers[i]);
        }
    }
}