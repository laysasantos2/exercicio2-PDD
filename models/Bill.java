package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bill {
    private int codigo;
    private LocalDate data;
    private double valor;

    public Bill(int codigo, String data, double valor) {
        this.codigo = codigo;
        this.data = formataDataStringToLocal(data);
        this.valor = valor;
    }

    private String formataDataLocalToString(LocalDate data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }

    private LocalDate formataDataStringToLocal(String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate returnData = LocalDate.parse(data, formatter);
        return returnData;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getData() {
        return this.formataDataLocalToString(data);
    }

    public double getValor() {
        return this.valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setData(String data) {
        this.data = formataDataStringToLocal(data);
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
