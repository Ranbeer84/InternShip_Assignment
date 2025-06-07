import java.nio.charset.Charset;
import java.util.Map;

public class AvailableCharsets {
    public static void main(String[] args) {
        Map<String, Charset> charsets = Charset.availableCharsets();

        System.out.println("Available Character Sets:\n");

        for (Map.Entry<String, Charset> entry : charsets.entrySet()) {
            Charset charset = entry.getValue();
            System.out.println("Charset: " + charset.name());
            System.out.println("Aliases: " + charset.aliases());
            System.out.println();
        }

        System.out.println("Total available character sets: " + charsets.size());
    }
}