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

        System.out.println("Initial array");
        System.out.println(words.toString());
        System.out.println("Unique words");
        System.out.println(unique.toString());
        System.out.println("Frequency of occurrence of words(Частота встречаемости слов):)");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
        System.out.println("Creating phonebook...");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");
        phonebook.add( 223344,"Ivanov");
        phonebook.add(22334411,"Ivanov");
        phonebook.add(22334499,"Petrov");
        phonebook.add(22334488,"Sidorov");
        phonebook.add(22334422,"Ivanov");
        System.out.println("Getting numbers...");
        phonebook.get("Ivanov");
        phonebook.get("Petrov");
        phonebook.get("Sidorov");
        System.out.println("-----------------");
        System.out.print("No entry case:");
        System.out.println("Abobkin");
        phonebook.get("Abobkin");
        System.out.println("-----------------");

    }
}

