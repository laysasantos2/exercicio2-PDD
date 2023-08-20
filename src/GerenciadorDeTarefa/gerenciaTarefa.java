package GerenciadorDeTarefa;

import java.util.ArrayList;

public class gerenciaTarefa {

    private ArrayList<Tarefa> tarefas;

    public gerenciaTarefa() {

        this.tarefas = new ArrayList<Tarefa>();
    }

    public void novaTarefa(String titulo, String descricao, String data, String prioridade) {
        Tarefa t = new Tarefa(titulo, descricao, data, prioridade);
        this.tarefas.add(t);
    }

    public void atualizaTarefa(String oldTitulo, String newTitulo, String descricao, String data, String prioridade) {
        Tarefa t = procuraTarefaTitulo(oldTitulo);
        t.setTitulo(newTitulo);
        t.setDescricao(descricao);
        t.setData(data);
        t.setPrioridade(prioridade);
        int indice = this.tarefas.indexOf(t);
        this.tarefas.set(indice, t);
    }

    public void excluiTarefa(String titulo) {
        Tarefa t = procuraTarefaTitulo(titulo);
        this.tarefas.remove(t);
    }

    public boolean tarefaExiste(String titulo) {
        Tarefa t = procuraTarefaTitulo(titulo);
        if(t == null) {
            return false;
        }
        return true;
    }

    public String getTarefa(String titulo) {
        Tarefa t = procuraTarefaTitulo(titulo);
        int indice = this.tarefas.indexOf(t);
        return this.tarefas.get(indice).toString();
    }

    public Tarefa procuraTarefaTitulo(String titulo) {
        for(Tarefa t : tarefas) {
            if(t.getTitulo().equals(titulo)) {
                return t;
            }
        }
        return null;
    }



}
