package br.com.tiagobarbosa.domain;

import br.com.tiagobarbosa.domain.Exceptions.MyException;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo01();
        } catch (ArithmeticException | NullPointerException | MyException e) {
            String message = e.getMessage();
            Throwable cause = e.getCause();
            System.out.println("Exception: " + message);
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo01() throws MyException {
        System.out.println("Inicio do metodo 01");
        metodo02();
        System.out.println("Fim do metodo 01");
    }

    private static void metodo02() throws MyException {
        System.out.println("Inicio do metodo 02");

        throw new MyException("Minha exceção.");

//        System.out.println("Fim do metodo 02");
    }
}
