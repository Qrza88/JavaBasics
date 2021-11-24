import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
//        Zadanie 16
//Napisz program który pobierze od użytkownika liczbę całkowitą i: a) wyświetli informację czy
//jest ona dodatnia, ujemna czy równa zero, b) wyświetli również informację czy jest ona
//parzysta czy nieparzysta.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Liczba dodatnia");

        } else if (number < 0) {
            System.out.println("LIczba ujemna");
        } else {
            System.out.println("liczba równa 0");
        }
        if(number %2==0){
            System.out.println("Liczba parzysta");
        } else {
            System.out.println("Liczba nieparzysta");
        }
    }
}
