package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.junit.Test;

import models.Bill;

public class BillTest {
    @Test
    public void createBillObject() {
        Bill bill = new Bill(0001, "05/07/2008", 500);

        assertNotNull(bill);

        assertEquals(bill.getCodigo(), 0001);
        assertEquals(bill.getData(), "05/07/2008");
        assertEquals(bill.getValor(), 500);
    }

    @Test
    public void createDataIncorrectly() {
        try {
            new Bill(1, "0585/0712/2008", 500);
        } catch (Exception error) {
            assertNotNull(error);
        }
    }

    @Test
    public void setDataIncorrectly() {
        try {
            Bill bill = new Bill(1, "05/08/2008", 500);
            bill.setData("4343/212/434");
            fail();
        } catch (Exception error) {
            assertNotNull(error);
        }
    }
}