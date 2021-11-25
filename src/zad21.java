import java.util.Scanner;

public class zad21 {
    public static void main(String[] args) {
//        / Stwórz tablicę liczb zmiennoprzecinkowych o rozmiarze 12 i uzupełnij ją średnimi cenami benzyny
//        // w kolejnych miesiącach 2021, następnie pozwól użytkownikowi zapytać o cenę w wybranym przez niego
//        // miesiącu


        double[] prices = new double[]{2.30, 4.00, 4.12, 4.55, 4.60, 4.90, 5.00, 5.10, 5.14, 5.25, 5.78, 6.10};
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj miesiąc:");
        double choice = prices[scan.nextInt()-1];
        System.out.print("Cena benzyny to " + choice);



    }
}
