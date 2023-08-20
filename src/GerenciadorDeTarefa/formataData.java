package GerenciadorDeTarefa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class formataData {

    public static String formataDataString(LocalDate data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }

    public static LocalDate formataStringData(String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataf = LocalDate.parse(data, formatter);
        return dataf;
    }
}
