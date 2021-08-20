import java.io.IOException;
import java.util.*;

public class HomeWorkApp {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Mercedes", "BMW", "BMW", "Audi", "Audi", "Audi", "Vokswagen",
                "Vokswagen", "Subaru", "Subaru", "Subaru", "Subaru",
                "Subaru", "Toyota", "Toyota", "Toyota", "Toyota", "Toyota", "Range Rover", "Opel"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}

