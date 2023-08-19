package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import utils.formataData;

enum StatusPagamento {
    PAGO,
    NAO_PAGO
}

public class Fatura {
    private LocalDate data;
    private double valorPago;
    private double valor;
    private StatusPagamento statusPagamento;

    private String cliente;
    private List<Pagamento> pagamentos;

    public Fatura(String data, double valor, String cliente) {
        this.data = formataData.formataDataStringToLocal(data);
        this.valor = valor;
        this.cliente = cliente;
        this.pagamentos = new ArrayList<Pagamento>();
        this.valorPago = 0;
        this.statusPagamento = StatusPagamento.NAO_PAGO;
    }

    public void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
        this.valorPago += pagamento.getValor();
        this.verificaPagamento();
    }

    public ArrayList<Pagamento> getPagamentos() {
        return (ArrayList<Pagamento>) this.pagamentos;
    }

    private void verificaPagamento() {
        if (this.valorPago >= valor) {
            this.statusPagamento = StatusPagamento.PAGO;
        }
    }

    public boolean isPaga() {
        return this.statusPagamento == StatusPagamento.PAGO;
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
