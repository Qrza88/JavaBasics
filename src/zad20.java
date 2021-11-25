import java.util.Random;
import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {
//        Stwórz tablicę Stringów o rozmiarze 3, uzupełnij ją cytatami i wypisz losowy cytat.

        String[] quote = new String[]{"Myślę więc jestem", "Perfekcja nie jest drogą do sukcesu", " Nikt nie rodzi sie rodzicem"};
        Random random = new Random();
        int index = random.nextInt(2);
        System.out.println(quote[index]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer");
        int number = scanner.nextInt();
        System.out.println(quote[number-1]);
    }
}
