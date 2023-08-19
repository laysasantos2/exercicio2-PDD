package models;

import java.util.List;

public class ProcessadorBoleto {
    public static void processarFatura(Fatura fatura, List<Boleto> boletos) {
        double totalPago = 0;

        for (Boleto boleto : boletos) {
            totalPago += boleto.getValor();
            fatura.adicionarPagamento(boleto.getValor(), boleto.getData(), "BOLETO");
        }

        if (totalPago >= fatura.valorTotal) {
            fatura.marcarComoPaga();
        }
    }
}
