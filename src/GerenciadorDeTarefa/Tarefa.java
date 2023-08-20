package GerenciadorDeTarefa;

import java.time.LocalDate;

public class Tarefa {

    private String titulo;
    private String descricao;
    private LocalDate data;
    private String prioridade;

    public Tarefa(String titulo, String descricao, String data, String prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = formataData.formataStringData(data);
        this.prioridade = prioridade;
    }
}
