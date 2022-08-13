import model.Cliente;
import model.Conta;

public class TestBank {
    public static void main(String[] args) {
        Cliente tiago = new Cliente("Tiago", "111.111.111-11", "programador");

        Conta conta1 = new Conta(111,2222,tiago);
        conta1.deposita(1000);

        System.out.printf("Titular: %s\nCpf: %s\nProfissão: %s\nSaldo: %s", conta1.getTitular().getNome(),
                conta1.getTitular().getCpf(), conta1.getTitular().getProfissao(), conta1.getSaldo());
    }
}
