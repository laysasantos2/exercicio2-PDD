package models;

import java.time.LocalDate;

import utils.formataData;

public class Pagamento {
    private double valor;
    private LocalDate data;
    private String tipo;

    public Pagamento(double valor, String data, String tipo) {
        this.valor = valor;
        this.data = formataData.formataDataStringToLocal(data);
        this.tipo = tipo;
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

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
