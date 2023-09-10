package gerenciadorDeTarefa.equivalencia;

import gerenciadorDeTarefa.gerenciaTarefa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class testGerenciaTarefa {

    private gerenciaTarefa gerencia;

    @BeforeEach
    void preparaGerencia() {

        this.gerencia = new gerenciaTarefa();
    }

    @Test
    public void criarTarefaDiaInvalidoMenor() {
        try {
            gerencia.novaTarefa("estudar concorrente", "semaforos", "00/08/2023", 1);
            fail("era esperado uma excecao");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void criarTarefaDiaInvalidoMaior() {
        try {
            gerencia.novaTarefa("estudar concorrente", "semaforos", "32/08/2023", 1);
            fail("era esperado uma excecao");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void criarTarefaMesInvalidoMenor() {
        try {
            gerencia.novaTarefa("estudar concorrente", "semaforos", "31/00/2023", 1);
            fail("era esperado uma excecao");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void criarTarefaMesInvalidoMaior() {
        try {
            gerencia.novaTarefa("estudar concorrente", "semaforos", "30/13/2023", 1);
            fail("era esperado uma excecao");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void criarTarefaAnoInvalido() {
        try {
            gerencia.novaTarefa("estudar concorrente", "semaforos", "05/08/0000", 1);
            fail("era esperado uma excecao");
        } catch (IllegalArgumentException e) {

        }
    }


    @Test
    public void criarTarefaPrioridadeMenor() {
        try {
            gerencia.novaTarefa("estudar concorrente", "semaforos", "30/08/2024", 0);
            fail("era esperado uma excecao");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void criarTarefaPrioridadeMaior() {
        try {
            gerencia.novaTarefa("estudar concorrente", "semaforos", "30/08/2024", 4);
            fail("era esperado uma excecao");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void criarTarefa() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "30/08/2024", 1);
        assertEquals(gerencia.tarefaStatus("estudar concorrente"), "Tarefa criada");
    }
}
