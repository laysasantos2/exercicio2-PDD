package gerenciadorDeTarefa.tabelaDeDecisao;

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
    public void atualizarTarefaQueNaoExiste() {
        try {
            gerencia.atualizaTarefa("estudar concorrente", "estudar IA", "busca em profundidade",
                    "19/08/2023", 1);
            fail("era esperado uma excecao");
        } catch (IllegalArgumentException e) {

        }

    }

    @Test
    public void atualizarTarefaQueExiste() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
        gerencia.atualizaTarefa("estudar concorrente", "estudar IA", "busca em profundidade", "19/08/2023", 1);
        assertEquals(gerencia.getTarefa("estudar IA"), "Titulo: estudar IA, Descricao: busca em profundidade, Data: 19/08/2023, Prioridade: 1\n");

    }

    @Test
    public void criarTarefaQueJaExiste() {
        try {
            gerencia.novaTarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
            gerencia.novaTarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
            fail("era esperado uma excecao");
        } catch (IllegalArgumentException e) {

        }

    }

}
