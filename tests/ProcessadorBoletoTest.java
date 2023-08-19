package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import models.Boleto;
import models.Fatura;
import models.ProcessadorBoleto;
import models.TipoPagamento;

public class ProcessadorBoletoTest {
    @Test
    public void testProcessarFaturaNaoPaga() {
        Fatura fatura = new Fatura("05/08/2023", 1500.00, "Cliente");
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(001, "05/08/2023", 500.00));
        boletos.add(new Boleto(002, "05/08/2023", 400.00));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertFalse(fatura.isPaga());
    }

    @Test
    public void testProcessarFaturaPaga() {
        Fatura fatura = new Fatura("05/08/2023", 1500.00, "Cliente");
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(001, "05/08/2023", 500.00));
        boletos.add(new Boleto(002, "05/08/2023", 400.00));
        boletos.add(new Boleto(003, "05/08/2023", 600.00));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertTrue(fatura.isPaga());
    }

    @Test
    public void testProcessarFaturaPagamentoCriado() {
        Fatura fatura = new Fatura("05/08/2023", 1500.00, "Cliente");
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(001, "05/08/2023", 500.00));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertEquals(1, fatura.getPagamentos().size());
        assertEquals(TipoPagamento.BOLETO, fatura.getPagamentos().get(0).getTipo());
    }
}
