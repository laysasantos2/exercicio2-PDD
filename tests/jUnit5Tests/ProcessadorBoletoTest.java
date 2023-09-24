package tests.jUnit5Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import models.Boleto;
import models.Fatura;
import models.ProcessadorBoleto;
import models.TipoPagamento;

@DisplayName("Testes de unidade para a classe ProcessadorBoleto")
public class ProcessadorBoletoTest {

    private Fatura fatura;
    private List<Boleto> boletos;

    @BeforeEach
    public void setUp() {
        fatura = new Fatura("05/08/2023", 1500.00, "Cliente");
        boletos = new ArrayList<>();
    }

    @Test
    @DisplayName("Teste de processamento de fatura paga")
    public void processarFaturaPaga() {
        boletos.add(new Boleto(001, "05/08/2023", 500.00));
        boletos.add(new Boleto(002, "05/08/2023", 400.00));
        boletos.add(new Boleto(003, "05/08/2023", 600.00));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertTrue(fatura.isPaga(), "A fatura deve estar paga.");
    }

    @Test
    @DisplayName("Teste de processamento de fatura não paga")
    public void processarFaturaNaoPaga() {
        boletos.add(new Boleto(001, "05/08/2023", 500.00));
        boletos.add(new Boleto(002, "05/08/2023", 400.00));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertFalse(fatura.isPaga(), "A fatura não deve estar paga.");
    }

    @Test
    @DisplayName("Teste de criação de pagamentos para fatura")
    public void processarFaturaPagamentoCriado() {
        boletos.add(new Boleto(001, "05/08/2023", 500.00));
        boletos.add(new Boleto(002, "05/08/2023", 400.00));
        boletos.add(new Boleto(003, "05/08/2023", 600.00));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertEquals(3, fatura.getPagamentos().size(), "Deveriam existir 3 pagamentos na fatura.");
        assertEquals(TipoPagamento.BOLETO, fatura.getPagamentos().get(0).getTipo(),
                "O tipo de pagamento deve ser BOLETO.");
        assertEquals(TipoPagamento.BOLETO, fatura.getPagamentos().get(1).getTipo(),
                "O tipo de pagamento deve ser BOLETO.");
        assertEquals(TipoPagamento.BOLETO, fatura.getPagamentos().get(2).getTipo(),
                "O tipo de pagamento deve ser BOLETO.");
    }
}
