import model.Cliente;
import model.Conta;

public class MainTest {
    public static void main(String[] args) {
        Conta conta1 = new Conta(111,2222,new Cliente("Tiago", "111.111.111-11", "programador"));

        conta1.deposita(200);
        conta1.deposita(300);
        System.out.println(conta1.getSaldo());

        conta1.saca(150);
        System.out.println(conta1.getSaldo());

        Conta conta2 = new Conta(111, 3333, new Cliente("Peter", "222.222.222-22", "padawan"));
        conta2.deposita(1000);

        boolean transfere = conta2.transfere(300, conta1);
        if (transfere) {
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Não havia dinheiro suficiente.");
        }
    }
}
