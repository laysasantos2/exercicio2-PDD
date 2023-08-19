package models;

import java.time.LocalDate;

import utils.formataData;

public class Boleto {
    private int codigo;
    private LocalDate data;
    private double valor;

    public Boleto(int codigo, String data, double valor) {
        this.codigo = codigo;
        this.data = formataData.formataDataStringToLocal(data);
        this.valor = valor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getData() {
        return formataData.formataDataLocalToString(data);
    }

    public double getValor() {
        return this.valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setData(String data) {
        this.data = formataData.formataDataStringToLocal(data);
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
