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
        this.boleto = new Boleto(1, "07/05/2008", 500);
    }

    @Test
    @DisplayName("Teste de criação de objeto Boleto")
    public void criarObjeto() {
        assertNotNull(boleto);
        assertEquals(1, boleto.getCodigo());
        assertEquals("07/05/2008", boleto.getData());
        assertEquals(500, boleto.getValor());
    }

    @Test
    @DisplayName("Teste de criação de objeto Boleto com data incorreta")
    public void createDateIncorrectly() {
        assertThrows(DateTimeException.class, () -> {
            new Boleto(1, "32/12/842", 500);
        });
    }

    @Test
    @DisplayName("Teste de definição de data incorreta")
    public void setDateIncorrectly() {
        assertThrows(DateTimeException.class, () -> {
            boleto.setData("12/17/1324");
        });
    }

    @Test
    @DisplayName("Teste de definição do código")
    public void setCodigo() {
        boleto.setCodigo(2);
        assertEquals(2, boleto.getCodigo());
    }

    @Test
    @DisplayName("Teste de definição do valor")
    public void setValor() {
        boleto.setValor(1000.0);
        assertEquals(1000.0, boleto.getValor(), 0.01);
    }
}
