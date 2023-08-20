package gerenciadorDeTarefa;

import GerenciadorDeTarefa.Tarefa;
import org.junit.jupiter.api.Test;

public class testTarefa {

    @Test
    public void criarTarefa() {
        Tarefa t = new Tarefa("estudar concorrente", "semaforos", "18/08/2023", "média");
    }
}
