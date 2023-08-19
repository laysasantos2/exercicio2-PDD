package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import models.Pagamento;
import models.TipoPagamento;

public class PagamentoTest {
    @Test
    public void criarPagamento() {
        Pagamento pagamento = new Pagamento(1000, "03/05/2005", TipoPagamento.BOLETO);

        assertEquals(pagamento.getValor(), 1000);
        assertEquals(pagamento.getData(), "03/05/2005");
        assertEquals(pagamento.getTipo(), TipoPagamento.BOLETO);
    }
}
