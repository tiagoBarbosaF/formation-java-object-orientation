import br.com.tiagobarbosa.java.tdd.domain.Funcionario;
import br.com.tiagobarbosa.java.tdd.service.BonusService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BonusServiceTest {
    private BonusService bonusService;
    private Funcionario funcionario;
    String nome = "Tiago";
    LocalDate dataAdmissao = LocalDate.now();
    BigDecimal salarioAlto = new BigDecimal(25000);
    BigDecimal salarioBaixo = new BigDecimal(2500);
    BigDecimal salarioIgual = new BigDecimal(10000);

    @BeforeEach
    public void inicializaDados(){
        bonusService = new BonusService();
    }


    @Test
    @DisplayName("Bônus deve ser zero quando o funcionário tiver um salário muito alto.")
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
        funcionario = new Funcionario(nome, dataAdmissao, salarioAlto);
        assertThrows(IllegalArgumentException.class, () -> bonusService.calcularBonus(funcionario));
    }

    @Test
    @DisplayName("Bônus deve ser dez por cento quando o funcionário tiver um salário baixo.")
    void bonusDeveSerDezPorCentoDoSalario() {
        funcionario = new Funcionario(nome, dataAdmissao, salarioBaixo);
        BigDecimal bonus = bonusService.calcularBonus(funcionario);
        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    @DisplayName("Bônus deve ser 1000 quando o funcionário tiver um salário exatamente de 10000.")
    void bonusDeveSerExatamenteMilReaisParaSalarioExatoDeDezMil() {
        funcionario = new Funcionario(nome, dataAdmissao, salarioIgual);
        BigDecimal bonus = bonusService.calcularBonus(funcionario);
        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}