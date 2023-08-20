package gerenciadorDeTarefa;

import GerenciadorDeTarefa.gerenciaTarefa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class testGerenciaTarefa {

    private gerenciaTarefa gerencia;

    @BeforeEach
    void preparaGerencia() {

        this.gerencia = new gerenciaTarefa();
    }

    @Test
    public void atualizarTarefa() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
        gerencia.atualizaTarefa("estudar concorrente", "estudar IA", "busca em profundidade", "19/08/2023", 1);
        assertEquals(gerencia.getTarefa("estudar IA"), "Titulo: estudar IA, Descricao: busca em profundidade, Data: 19/08/2023, Prioridade: 1\n");

    }

    @Test
    public void excluirTarefa() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
        gerencia.excluiTarefa("estudar concorrente");
        assertFalse(gerencia.tarefaExiste("estudar concorrente"));
    }

    @Test
    public void exibirTarefaPorData() {
        gerencia.novaTarefa("estudar IA", "busca em profundidade", "18/08/2023", 3);
        gerencia.novaTarefa("estudar concorrente", "semaforos", "16/08/2023", 2);
        assertEquals(gerencia.exibirTarefaData(), "Titulo: estudar concorrente, Descricao: semaforos, Data: 16/08/2023, Prioridade: 2\n" +
                "Titulo: estudar IA, Descricao: busca em profundidade, Data: 18/08/2023, Prioridade: 3\n");
    }

    @Test
    public void exibirTarefaPrioridade() {
        gerencia.novaTarefa("estudar IA", "busca em profundidade", "18/08/2023", 3);
        gerencia.novaTarefa("estudar concorrente", "semaforos", "16/08/2023", 2);
        assertEquals(gerencia.exibirTarefaPrioridade(), "Titulo: estudar concorrente, Descricao: semaforos, Data: 16/08/2023, Prioridade: 2\n" +
                "Titulo: estudar IA, Descricao: busca em profundidade, Data: 18/08/2023, Prioridade: 3\n");
    }


}
