package tests.functional_tests.tabelas_de_decisao;

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
    public void testSomaBoletoMaiorOuIgualQueFatura() {
        Fatura fatura = new Fatura("05/08/2023", 500.00, "Cliente");
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(001, "05/08/2023", 500.00));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertTrue(fatura.isPaga());
        assertFalse(!fatura.isPaga());
    }

    @Test
    public void testSomaBoletoMenorQueFatura() {
        Fatura fatura = new Fatura("05/08/2023", 500.00, "Cliente");

        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(001, "05/08/2023", 499.99));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertFalse(fatura.isPaga());
        assertTrue(!fatura.isPaga());
    }
}
