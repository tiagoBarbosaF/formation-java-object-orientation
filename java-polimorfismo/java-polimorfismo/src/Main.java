import Service.ControleBonificacao;
import model.Funcionarios.Desenvolvedor;
import model.Base.Funcionario;
import model.Funcionarios.Gerente;

public class Main {
    public static void main(String[] args) {
        Funcionario tiago = new Desenvolvedor();
        tiago.setNome("Tiago Barbosa");
        tiago.setCpf("2233445566-99");
        tiago.setSalario(7000);
        System.out.println("Funcionário: " + tiago.getNome());
        System.out.println("Bonificação: " + tiago.getBonificacao());
        System.out.println("--------------------------------");

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Peter");
        gerente1.setSalario(5000);
        System.out.println("Gerente: " + gerente1.getNome());
        System.out.println("Salário: " + gerente1.getSalario());
        System.out.println("Bonificação: " + gerente1.getBonificacao());
        System.out.println("--------------------------------");

        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.setNome("Rakel");
        desenvolvedor.setSalario(7000);
        System.out.println("Desenvolvedor: " + desenvolvedor.getNome());
        System.out.println("Salário: " + desenvolvedor.getSalario());
        System.out.println("Bonificação: " + desenvolvedor.getBonificacao());
        System.out.println("--------------------------------");

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(tiago);
        controleBonificacao.registra(gerente1);
        controleBonificacao.registra(desenvolvedor);
        System.out.println("Total bonificações: " + controleBonificacao.getSoma());
    }
}
