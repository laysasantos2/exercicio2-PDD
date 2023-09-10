package tests.particao_por_equivalencia;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import models.Boleto;
import models.Fatura;
import models.ProcessadorBoleto;

public class ProcessadorBoletoTest {
    @Test
    public void testFaturaIgualSomaDosBoletos() {
        Fatura fatura = new Fatura("05/08/2023", 500.00, "Cliente");
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(001, "05/08/2023", 500.00));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertTrue(fatura.isPaga());
    }

    @Test
    public void testFaturaMenorQueSomaDosBoletos() {
        Fatura fatura = new Fatura("05/08/2023", 499.00, "Cliente");

        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(001, "05/08/2023", 500.00));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertTrue(fatura.isPaga());
    }

    @Test
    public void testFaturaMaiorQueSomaDosBoletos() {

        Fatura fatura = new Fatura("05/08/2023", 501.00, "Cliente");

        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(001, "05/08/2023", 500.00));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertFalse(fatura.isPaga());
    }
}
