package models;

import java.time.LocalDate;

import utils.formataData;

public class Fatura {
    private LocalDate data;
    private double valor;
    private String cliente;

    public Fatura(String data, double valor, String cliente) {
        this.data = formataData.formataDataStringToLocal(data);
        this.valor = valor;
        this.cliente = cliente;
    }

    public String getData() {
        return formataData.formataDataLocalToString(this.data);
    }

    public void setData(String data) {
        this.data = formataData.formataDataStringToLocal(data);
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

}
