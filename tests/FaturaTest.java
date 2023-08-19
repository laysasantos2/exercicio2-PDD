package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import models.Fatura;

public class FaturaTest {
    @Test
    public void createFatura() {
        Fatura fatura = new Fatura("05/09/2003", 5000, "João");

        assertEquals(fatura.getData(), "05/09/2003");
        assertEquals(fatura.getValor(), 5000);
        assertEquals(fatura.getCliente(), "João");
    }
}
