package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

import models.Boleto;
import models.Fatura;

public class FaturaTest {
    @Test
    public void createFatura() {
        Fatura fatura = new Fatura("05/09/2003", 5000, "João");

        assertEquals(fatura.getData(), "05/09/2003");
        assertEquals(fatura.getValor(), 5000);
        assertEquals(fatura.getCliente(), "João");
    }

    @Test
    public void createDateIncorrectly() {
        try {
            new Fatura("0585/0712/2008", 500, "João");
        } catch (Exception error) {
            assertNotNull(error);
        }
    }

    @Test
    public void setDateIncorrectly() {
        try {
            Fatura fatura = new Fatura("05/08/2008", 500, "João");
            fatura.setData("4343/212/434");
            fail();
        } catch (Exception error) {
            assertNotNull(error);
        }
    }
}
