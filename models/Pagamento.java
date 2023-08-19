package models;

import java.time.LocalDate;

import utils.formataData;

public class Pagamento {
    private double valor;
    private LocalDate data;
    private TipoPagamento tipoPagamento;

    public Pagamento(double valor, String data, TipoPagamento tipoPagamento) {
        this.valor = valor;
        this.data = formataData.formataDataStringToLocal(data);
        this.tipoPagamento = tipoPagamento;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return formataData.formataDataLocalToString(this.data);
    }

    public void setData(String data) {
        this.data = formataData.formataDataStringToLocal(data);
    }

    public TipoPagamento getTipo() {
        return this.tipoPagamento;
    }

    public void setTipo(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
