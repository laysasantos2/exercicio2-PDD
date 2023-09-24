package gerenciadorDeTarefa.junit5Tests;

import gerenciadorDeTarefa.gerenciaTarefa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testGerenciaTarefa {

    private gerenciaTarefa gerencia;

    @BeforeEach
    void preparaGerencia() {

        this.gerencia = new gerenciaTarefa();
    }

    @Test
    @DisplayName("Teste para atualizar a tarefa")
    public void atualizarTarefa() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
        gerencia.atualizaTarefa("estudar concorrente", "estudar IA", "busca em profundidade", "19/08/2023", 1);
        assertEquals(gerencia.getTarefa("estudar IA"), "Titulo: estudar IA, Descricao: busca em profundidade, Data: 19/08/2023, Prioridade: 1\n");

    }

    @Test
    @DisplayName("Teste para excluir uma tarefa")
    public void excluirTarefa() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
        gerencia.excluiTarefa("estudar concorrente");
        assertFalse(gerencia.tarefaExiste("estudar concorrente"));
    }

    @Test
    @DisplayName("Teste para exibir uma tarefa a partir da sua data")
    public void exibirTarefaPorData() {
        gerencia.novaTarefa("estudar IA", "busca em profundidade", "18/08/2023", 3);
        gerencia.novaTarefa("estudar concorrente", "semaforos", "16/08/2023", 2);
        assertEquals(gerencia.exibirTarefaData(), "Titulo: estudar concorrente, Descricao: semaforos, Data: 16/08/2023, Prioridade: 2\n" +
                "Titulo: estudar IA, Descricao: busca em profundidade, Data: 18/08/2023, Prioridade: 3\n");
    }

    @Test
    @DisplayName("Teste para exibir uma tarefa a partir da sua prioridade")
    public void exibirTarefaPrioridade() {
        gerencia.novaTarefa("estudar IA", "busca em profundidade", "18/08/2023", 3);
        gerencia.novaTarefa("estudar concorrente", "semaforos", "16/08/2023", 2);
        assertEquals(gerencia.exibirTarefaPrioridade(), "Titulo: estudar concorrente, Descricao: semaforos, Data: 16/08/2023, Prioridade: 2\n" +
                "Titulo: estudar IA, Descricao: busca em profundidade, Data: 18/08/2023, Prioridade: 3\n");
    }

    @Test
    @DisplayName("Teste para atualizar uma tarefa que não existe")
    public void atualizarTarefaQueNaoExiste() {
        assertThrows(Exception.class, () -> {
            gerencia.atualizaTarefa("estudar concorrente", "estudar IA", "busca em profundidade",
                    "19/08/2024", 1);
        });
    }

    @Test
    @DisplayName("Teste para criar uma tarefa com ano inválido")
    public void criarTarefaAnoInvalido() {
        assertThrows(Exception.class, () -> {
            gerencia.novaTarefa("estudar concorrente", "semaforos", "05/08/0000", 1);
        });
    }

    @Test
    @DisplayName("Teste para criar tarefa com descrição inválida")
    public void criarTarefaTituloInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            gerencia.novaTarefa("", "semaforos", "30/08/2024", 1);
        });
    }

}
