package tests;

import org.junit.Test;

import models.Pagamento;

public class PagamentoTest {
    @Test
    public void createPagamento() {
        Pagamento pagamento = new Pagamento(1000, "03/05/2005", "BOLETO");

        assertEquals(pagamento.getValor(), 1000);
        assertEquals(pagamento.getData(), "03/05/2005");
        assertEquals(pagamento.getTipo(), "BOLETO");
    }
}
