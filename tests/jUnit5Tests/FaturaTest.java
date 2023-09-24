package tests.jUnit5Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import models.Fatura;

@DisplayName("Testes de unidade para a classe Fatura")
public class FaturaTest {

    @Test
    @DisplayName("Teste de criação de Fatura")
    public void criarFatura() {
        Fatura fatura = new Fatura("05/09/2003", 5000, "João");

        assertEquals("05/09/2003", fatura.getData());
        assertEquals(5000, fatura.getValor());
        assertEquals("João", fatura.getCliente());
    }

    @Test
    @DisplayName("Teste de criação de Fatura com data incorreta")
    public void createDateIncorrectly() {
        assertThrows(Exception.class, () -> {
            new Fatura("0585/0712/2008", 500, "João");
        });
    }

    @Test
    @DisplayName("Teste de definição de data incorreta")
    public void setDateIncorrectly() {
        assertThrows(Exception.class, () -> {
            Fatura fatura = new Fatura("05/08/2008", 500, "João");
            fatura.setData("4343/212/434");
        });
    }
}
