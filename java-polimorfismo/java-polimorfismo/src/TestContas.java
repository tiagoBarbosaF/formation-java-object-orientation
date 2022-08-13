import Service.SeguroVida;
import model.Base.CalcularImposto;
import model.Pessoas.Cliente;
import model.Contas.ContaCorrente;
import model.Contas.ContaPoupanca;

public class TestContas {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(111, 2222, new Cliente("Tiago", "1111111", "programador"));
//        ContaPoupanca contaPoupanca = new ContaPoupanca(333, 5555, new Cliente("Tiago", "1111111", "programador"));
        contaCorrente.deposita(1000);
//        contaPoupanca.deposita(100);
//        contaCorrente.transfere(250, contaPoupanca);

        SeguroVida seguroVida = new SeguroVida();
        CalcularImposto calcularImposto = new CalcularImposto();
        calcularImposto.registra(contaCorrente);
        calcularImposto.registra(seguroVida);



        System.out.println("conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Percentual tributação da conta corrente: " + contaCorrente.getPercentualTributacao());
        System.out.println("Impostos conta corrente: " + contaCorrente.getValorImposto());
        System.out.println("Seguro de vida: " + seguroVida.getValorImposto());
        System.out.println("Total impostos: " + calcularImposto.getTotalImpostos());
//        System.out.println("conta poupança: " + contaPoupanca.getSaldo());
    }
}
