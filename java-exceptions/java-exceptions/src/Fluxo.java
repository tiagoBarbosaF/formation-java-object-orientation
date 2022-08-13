public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo01();
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
        }
        System.out.println("Fim do metodo 02");
    }
}
