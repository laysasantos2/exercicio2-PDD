package gerenciadorDeTarefa.junit5Tests;

import gerenciadorDeTarefa.Tarefa;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testes para a classe Tarefa")
public class testTarefa {

    @Test
    @DisplayName("Teste para atualizar titulo da tarefa")
    public void atualizarTitulo() {
        Tarefa t = new Tarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
        t.setTitulo("estudar IA");
        assertEquals(t.getTitulo(), "estudar IA");
    }

    @Test
    @DisplayName("Teste para atualizar descrição da tarefa")
    public void atualizarDescricao() {
        Tarefa t = new Tarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
        t.setDescricao("estrutura de dados");
        assertEquals(t.getDescricao(), "estrutura de dados");
    }

    @Test
    @DisplayName("Teste para atualizar a data da tarefa")
    public void atualizarData() {
        Tarefa t = new Tarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
        t.setData("20/08/2023");
        assertEquals(t.getData(), "20/08/2023");
    }

    @Test
    @DisplayName("Teste para atualizar a prioridade da tarefa")
    public void atualizarPrioridade() {
        Tarefa t = new Tarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
        t.setPrioridade(1);
        assertEquals(t.getPrioridade(), 1);
    }

}
