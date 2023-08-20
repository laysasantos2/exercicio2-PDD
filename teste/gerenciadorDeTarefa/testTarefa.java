package gerenciadorDeTarefa;

import GerenciadorDeTarefa.Tarefa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testTarefa {

    @Test
    public void criarTarefa() {
        Tarefa t = new Tarefa("estudar concorrente", "semaforos", "18/08/2023", "média");
    }

    @Test
    public void atualizarTitulo() {
        Tarefa t = new Tarefa("estudar concorrente", "semaforos", "18/08/2023", "média");
        t.setTitulo("estudar IA");
        assertEquals(t.getTitulo(), "estudar IA");
    }
}
