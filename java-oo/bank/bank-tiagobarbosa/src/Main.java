import model.Cliente;
import model.Conta;

public class Main {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(111, 2222, new Cliente("Tiago", "111.111.111-11", "programador"));
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());
        primeiraConta.deposita(300);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(111, 3333, new Cliente("Peter", "222.222.222-22", "padawan"));
        segundaConta.deposita(100);
        System.out.printf("Primeira conta %s \n", primeiraConta.getSaldo());
        System.out.printf("Segunda conta %s\n", segundaConta.getSaldo());

        Cliente clienteRakel = new Cliente("Rakel", "333.333.333-33", "developer");

        System.out.println("Total de contas: " + Conta.getTotalContas());
        System.out.println("Total de clientes: " + Cliente.getTotalClientes());
    }
}