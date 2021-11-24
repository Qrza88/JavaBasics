import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
//        Zadanie 15
//Napisz program, który pobierze liczbę reprezentującą wiek użytkownika w latach (liczba
//całkowita), a następnie wyświetli czy jest on pełnoletni czy nie.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int year = scanner.nextInt();
        if(year>18){
            System.out.println("Pełnoletni");
        }
        else{
            System.out.println("Niepełnoletni");
        }
    }
}
