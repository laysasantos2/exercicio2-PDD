package gerenciadorDeTarefa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testTarefa {

    @Test
    public void criarTarefa() {
        Tarefa t = new Tarefa("estudar concorrente", "semaforos", "18/08/2023", 1);
    }

    @Test
    public void atualizarTitulo() {
        Tarefa t = new Tarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
        t.setTitulo("estudar IA");
        assertEquals(t.getTitulo(), "estudar IA");
    }

    @Test
    public void atualizarDescricao() {
        Tarefa t = new Tarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
        t.setDescricao("estrutura de dados");
        assertEquals(t.getDescricao(), "estrutura de dados");
    }

    @Test
    public void atualizarData() {
        Tarefa t = new Tarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
        t.setData("20/08/2023");
        assertEquals(t.getData(), "20/08/2023");
    }

    @Test
    public void atualizarPrioridade() {
        Tarefa t = new Tarefa("estudar concorrente", "semaforos", "18/08/2023", 2);
        t.setPrioridade(1);
        assertEquals(t.getPrioridade(), 1);
    }

}
