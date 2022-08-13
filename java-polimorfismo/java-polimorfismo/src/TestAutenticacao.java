import model.Funcionarios.Gerente;
import model.Pessoas.Cliente;
import model.Pessoas.Fiscal;
import model.SistemaInterno;

public class TestAutenticacao {
    public static void main(String[] args) {
        SistemaInterno sistemaInterno = new SistemaInterno();
        Cliente cliente = new Cliente("Tiago", "111111", "desenvolvedor");
        cliente.setSenha(2222);

        Gerente gerente = new Gerente();
         gerente.setSenha(3333);

        Fiscal fiscal = new Fiscal();
        fiscal.setSenha(2222);

        sistemaInterno.autentica(cliente);
        sistemaInterno.autentica(gerente);
        sistemaInterno.autentica(fiscal);
    }
}
