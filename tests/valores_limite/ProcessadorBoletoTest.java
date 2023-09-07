package tests.valores_limite;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import models.Boleto;
import models.Fatura;
import models.ProcessadorBoleto;

public class ProcessadorBoletoTest {

    @Test
    public void testSomaBoletoMenorQueFatura() {
        Fatura fatura = new Fatura("05/08/2023", 500.00, "Cliente");
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(001, "05/08/2023", 499.00));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertFalse(fatura.isPaga());
    }

    @Test
    public void testSomaBoletoIgualFatura() {
        Fatura fatura = new Fatura("05/08/2023", 500.00, "Cliente");

        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(001, "05/08/2023", 500.00));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertFalse(fatura.isPaga());
    }

    @Test
    public void testSomaBoletoMaiorQueFatura() {

        Fatura fatura = new Fatura("05/08/2023", 500.00, "Cliente");

        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(001, "05/08/2023", 501.00));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertTrue(fatura.isPaga());
    }

    @Test
    public void testSomaBoletoValorQualquerMaiorQueFatura() {
        Fatura fatura = new Fatura("05/08/2023", 500.00, "Cliente");

        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(001, "05/08/2023", 713.49));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertTrue(fatura.isPaga());
    }

    @Test
    public void testSomaBoletoValorQualquerMenorQueFatura() {
        Fatura fatura = new Fatura("05/08/2023", 500.00, "Cliente");

        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(001, "05/08/2023", 231.14));

        ProcessadorBoleto.processarFatura(fatura, boletos);

        assertFalse(fatura.isPaga());
    }

}
