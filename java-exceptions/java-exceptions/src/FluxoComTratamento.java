public class FluxoComTratamento {
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
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
//            int num = 3 / 0;
            Conta conta = null;
            conta.deposita();
        }
        System.out.println("Fim do metodo 02");
    }
}
