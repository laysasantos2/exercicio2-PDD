package models;

import java.util.List;

public class ProcessadorBoleto {
    public static void processarFatura(Fatura fatura, List<Boleto> boletos) {
        for (Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), boleto.getData(), TipoPagamento.BOLETO);
            fatura.adicionarPagamento(pagamento);
        }
    }
}
