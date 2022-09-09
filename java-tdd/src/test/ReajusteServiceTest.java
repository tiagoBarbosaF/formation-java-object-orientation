import br.com.tiagobarbosa.java.tdd.domain.Desempenho;
import br.com.tiagobarbosa.java.tdd.domain.Funcionario;
import br.com.tiagobarbosa.java.tdd.domain.ReajusteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReajusteServiceTest {
    private ReajusteService service;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializaDados(){
        service = new ReajusteService();
        funcionario = new Funcionario("Tiago", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @Test
    @DisplayName("Reajuste deve ser três por cento quando o desempenho for a desejar.")
    void reajusteDeveSerTresPorCentroQuandoDesempenhoForADesejar() {
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    @DisplayName("Reajuste deve ser quinze por cento quando o desempenho for bom.")
    void reajusteDeveSerQuinzePorCentroQuandoDesempenhoForBom() {
        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    @DisplayName("Reajuste deve ser vinte por cento quando o desempenho for ótimo.")
    void reajusteDeveSerVintePorCentroQuandoDesempenhoForOtimo() {
        service.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
