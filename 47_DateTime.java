import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDateTime {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formatted = current.format(formatter);
        System.out.println("Current date and time: " + formatted);
    }
}