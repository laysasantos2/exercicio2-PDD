package tests.jUnit5Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import models.Boleto;
import java.time.DateTimeException;

@DisplayName("Testes para a classe Boleto")
public class BoletoTest {

    private Boleto boleto;

    @BeforeEach
    public void setUp() {
        this.boleto = new Boleto(1, "2008-07-05", 500);
    }

    @Test
    @DisplayName("Teste de criação de objeto Boleto")
    public void criarObjeto() {
        assertNotNull(boleto);
        assertEquals(1, boleto.getCodigo());
        assertEquals("2008-07-05", boleto.getData());
        assertEquals(500, boleto.getValor());
    }

    @Test
    @DisplayName("Teste de criação de objeto Boleto com data incorreta")
    public void createDateIncorrectly() {
        assertThrows(DateTimeException.class, () -> {
            new Boleto(1, "0585-07-12", 500);
        });
    }

    @Test
    @DisplayName("Teste de definição de data incorreta")
    public void setDateIncorrectly() {
        assertThrows(DateTimeException.class, () -> {
            boleto.setData("4343-02-434");
        });
    }
}
