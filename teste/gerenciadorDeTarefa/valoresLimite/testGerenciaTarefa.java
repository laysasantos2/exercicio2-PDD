package gerenciadorDeTarefa.valoresLimite;

import gerenciadorDeTarefa.gerenciaTarefa;
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
    public void criarTarefaPrioridadeMenorValorLimite() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "18/09/2023", 1);
        assertEquals(gerencia.getTarefaStatus("estudar concorrente"), "tarefa criada com sucesso";
    }

    @Test
    public void criarTarefaPrioridadeMenorValorLimiteMais1() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "18/09/2023", 2);
        assertEquals(gerencia.getTarefaStatus("estudar concorrente"), "tarefa criada com sucesso";
    }

    @Test
    public void criarTarefaPrioridadeMaiorValorLimite() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "18/09/2023", 3);
        assertEquals(gerencia.getTarefaStatus("estudar concorrente"), "tarefa criada com sucesso";
    }

    @Test
    public void criarTarefaDataMenorValorLimite() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "01/01/2024", 1);
        assertEquals(gerencia.getTarefaStatus("estudar concorrente"), "tarefa criada com sucesso";
    }

    @Test
    public void criarTarefaDataMenorValorLimiteMais1() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "02/01/2024", 1);
        assertEquals(gerencia.getTarefaStatus("estudar concorrente"), "tarefa criada com sucesso";
    }

    @Test
    public void criarTarefaDataMaiorValorLimite() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "31/12/2023", 1);
        assertEquals(gerencia.getTarefaStatus("estudar concorrente"), "tarefa criada com sucesso";
    }

    @Test
    public void criarTarefaDataMaiorValorLimiteMenos1() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "30/12/2023", 1);
        assertEquals(gerencia.getTarefaStatus("estudar concorrente"), "tarefa criada com sucesso";
    }

    @Test
    public void criarTarefaDataQualquer() {
        gerencia.novaTarefa("estudar concorrente", "semaforos", "06/07/2024", 1);
        assertEquals(gerencia.getTarefaStatus("estudar concorrente"), "tarefa criada com sucesso";
    }

}
