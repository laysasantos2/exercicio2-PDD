package tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import models.Bill;

public class BillTest {
    @Test
    public void createBillObject() {
        Bill bill = Bill(0001, "05/07/2008", 500);

        assertNotNull(bill);

        assertEquals(bill.getCodigo(), 0001);
        assertEquals(bill.getData(), "05/07/2008");
        assertEquals(bill.getValor(). 500);
    }
}