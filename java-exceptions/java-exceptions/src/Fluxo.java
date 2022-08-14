public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo01();
        } catch (ArithmeticException | NullPointerException e) {
            String message = e.getMessage();
            Throwable cause = e.getCause();
            System.out.println("Exception: " + message);
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo01() {
        System.out.println("Inicio do metodo 01");
        metodo02();
        System.out.println("Fim do metodo 01");
    }

    private static void metodo02() {
        System.out.println("Inicio do metodo 02");

        throw new ArithmeticException("Não pode divider por zero.");

//        System.out.println("Fim do metodo 02");
    }
}
