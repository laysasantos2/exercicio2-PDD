package gerenciadorDeTarefa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class gerenciaTarefa {

    private ArrayList<Tarefa> tarefas;

    public gerenciaTarefa() {

        this.tarefas = new ArrayList<Tarefa>();
    }

    /**
     * Criar uma nova tarefa e adicionar ela ao ArrayList
     */

    public void novaTarefa(String titulo, String descricao, String data, int prioridade) {
        Tarefa t = new Tarefa(titulo, descricao, data, prioridade);
        this.tarefas.add(t);
    }

    /**
     * Atualizar tarefa podendo modificar todas as informações
     */

    public void atualizaTarefa(String oldTitulo, String newTitulo, String descricao, String data, int prioridade) {
        Tarefa t = procuraTarefaTitulo(oldTitulo);
        t.setTitulo(newTitulo);
        t.setDescricao(descricao);
        t.setData(data);
        t.setPrioridade(prioridade);
        int indice = this.tarefas.indexOf(t);
        this.tarefas.set(indice, t);
    }

    /**
     * Exclui uma tarefa selecionada
     */

    public void excluiTarefa(String titulo) {
        Tarefa t = procuraTarefaTitulo(titulo);
        this.tarefas.remove(t);
    }

    /**
     * Verifica se a tarefa existe, para ter certeza de que ela foi criada corretamente.
     */

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

    /**
     * Para ter acesso a tarefa a partir do titulo.
     */

    public Tarefa procuraTarefaTitulo(String titulo) {
        for(Tarefa t : tarefas) {
            if(t.getTitulo().equals(titulo)) {
                return t;
            }
        }
        return null;
    }

    /**
     * Ordena a lista a partir da data de vencimento da tarefa.
     * @return uma string contendo as tarefas ordenadas.
     */

    public String exibirTarefaData() {
        String saida = "";
        Collections.sort(tarefas, new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa o1, Tarefa o2) {
                return o1.getData().compareTo(o2.getData());
            }
        });

        for (Tarefa obj : tarefas) {
            saida += obj.toString();
        }
        return saida;

    }

    /**
     * Ordena a tarefa de acordo com sua prioridade.
     * @return uma string contendo todas as tarefas ordenadas.
     */

    public String exibirTarefaPrioridade() {
        String saida = "";
        Collections.sort(tarefas, new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa o1, Tarefa o2) {
                return Integer.compare(o1.getPrioridade(), o2.getPrioridade());
            }
        });

        for (Tarefa obj : tarefas) {
            saida += obj.toString();
        }

        return saida;
    }
}
