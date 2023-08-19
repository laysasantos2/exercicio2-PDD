package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class formataData {
    public static String formataDataLocalToString(LocalDate data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }

    public static LocalDate formataDataStringToLocal(String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate returnData = LocalDate.parse(data, formatter);
        return returnData;
    }
}
