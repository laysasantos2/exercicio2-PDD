package tests.jUnit5Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import models.Pagamento;
import models.TipoPagamento;

@DisplayName("Testes de unidade para a classe Pagamento")
public class PagamentoTest {

    private Pagamento pagamento;

    @BeforeEach
    public void setUp() {
        pagamento = new Pagamento(1000, "03/05/2005", TipoPagamento.BOLETO);
    }

    @Test
    @DisplayName("Teste de criação de pagamento")
    public void criarPagamento() {
        assertEquals(1000, pagamento.getValor(), "O valor do pagamento deve ser 1000.");
        assertEquals("03/05/2005", pagamento.getData(), "A data do pagamento deve ser '03/05/2005'.");
        assertEquals(TipoPagamento.BOLETO, pagamento.getTipo(), "O tipo de pagamento deve ser BOLETO.");
    }

    @Test
    @DisplayName("Teste de alteração do valor do pagamento")
    public void alterarValorPagamento() {
        pagamento.setValor(1500);
        assertEquals(1500, pagamento.getValor(), "O valor do pagamento deve ser 1500 após a alteração.");
    }

    @Test
    @DisplayName("Teste de alteração da data do pagamento")
    public void alterarDataPagamento() {
        pagamento.setData("15/06/2006");
        assertEquals("15/06/2006", pagamento.getData(), "A data do pagamento deve ser '15/06/2006' após a alteração.");
    }

    @Test
    @DisplayName("Teste de alteração do tipo de pagamento")
    public void alterarTipoPagamento() {
        pagamento.setTipo(TipoPagamento.CARTAO);
        assertEquals(TipoPagamento.CARTAO, pagamento.getTipo(), "O tipo de pagamento deve ser CARTAO após a alteração.");
    }
}
