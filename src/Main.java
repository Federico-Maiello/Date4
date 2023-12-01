import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String inputString = "2023-03-01T13:00:00Z";

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);

        offsetDateTime = offsetDateTime.plusYears(1);

        offsetDateTime = offsetDateTime.minusMonths(1);

        offsetDateTime = offsetDateTime.plusDays(7);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);
        String formattedDate = offsetDateTime.format(formatter);

        System.out.println("Risultato localizzato per l'Italia: " + formattedDate);
    }
}
