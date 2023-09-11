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
    public void criaTarefa() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "30/08/2024", 1);
        assertEquals(gerencia.tarefaStatus("estudar concorrente"), "Tarefa criada");
    }

    @Test
    public void criarTarefaTituloInvalido() {
        try {
            gerencia.novaTarefa("", "semaforos", "30/08/2024", 1);
            fail("era esperado uma excecao");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void criaTarefaComDescricao() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "30/08/2024", 1);
        assertEquals(gerencia.tarefaStatus("estudar concorrente"), "Tarefa criada");
    }

    @Test
    public void criarTarefaSemDescricao() {
        try {
            gerencia.novaTarefa("estudar concorrente", "", "30/08/2024", 1);
            fail("era esperado uma excecao");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void criarTarefaDiaInvalido() {
        try {
            gerencia.novaTarefa("estudar concorrente", "semaforos", "00/08/2023", 1);
            fail("era esperado uma excecao");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void criarTarefaMesInvalido() {
        try {
            gerencia.novaTarefa("estudar concorrente", "semaforos", "31/00/2023", 1);
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
    public void criaTarefaDataValida() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "05/08/2024", 1);
        assertEquals(gerencia.tarefaStatus("estudar concorrente"), "Tarefa criada");
    }


    @Test
    public void criarTarefaPrioridadeInvalida() {
        try {
            gerencia.novaTarefa("estudar concorrente", "semaforos", "30/08/2024", 0);
            fail("era esperado uma excecao");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void criarTarefaPrioridadeValida() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "30/08/2024", 1);
        assertEquals(gerencia.tarefaStatus("estudar concorrente"), "Tarefa criada");
    }
}
