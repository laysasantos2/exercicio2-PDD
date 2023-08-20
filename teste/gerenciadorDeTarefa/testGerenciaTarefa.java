package gerenciadorDeTarefa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertEquals(gerencia.getTarefa("estudar IA"), "titulo: estudar IA, descrição: busca em profundidade, data: 19/08/2023, prioridade alta");
    }

}
