package GerenciadorDeTarefa;

import java.time.LocalDate;

public class Tarefa  {

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

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return formataData.formataDataString(data);
    }

    public void setData(String data) {
        this.data = formataData.formataStringData(data);
    }

    public String getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String toString() {
        return "Titulo: " + getTitulo() +
                ", Descricao: " + getDescricao() +
                ", Data: " + getData() +
                ", Prioridade: " + getPrioridade() + "\n";
    }
}
