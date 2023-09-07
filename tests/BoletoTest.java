package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

import models.Boleto;

public class BoletoTest {
    @Test
    public void criarObjeto() {
        Boleto bill = new Boleto(0001, "05/07/2008", 500);

        assertNotNull(bill);

        assertEquals(bill.getCodigo(), 0001);
        assertEquals(bill.getData(), "05/07/2008");
        assertEquals(bill.getValor(), 500);
    }

    @Test
    public void createDateIncorrectly() {
        try {
            new Boleto(1, "0585/0712/2008", 500);
        } catch (Exception error) {
            assertNotNull(error);
        }
    }

    @Test
    public void setDateIncorrectly() {
        try {
            Boleto bill = new Boleto(1, "05/08/2008", 500);
            bill.setData("4343/212/434");
            fail();
        } catch (Exception error) {
            assertNotNull(error);
        }
    }
}