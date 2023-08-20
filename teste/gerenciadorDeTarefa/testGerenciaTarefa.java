package gerenciadorDeTarefa;

import GerenciadorDeTarefa.gerenciaTarefa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testGerenciaTarefa {

    private gerenciaTarefa gerencia;

    @BeforeEach
    void preparaGerencia() {

        this.gerencia = new gerenciaTarefa();
    }

    @Test
    public void atualizarTarefa() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "18/08/2023", "média");
        gerencia.atualizaTarefa("estudar concorrente", "estudar IA", "busca em profundidade", "19/08/2023", "alta");
        assertEquals(gerencia.getTarefa("estudar IA"), "Titulo: estudar IA, Descricao: busca em profundidade, Data: 19/08/2023, Prioridade: alta\n");

    }

}