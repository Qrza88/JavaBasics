import java.util.Scanner;

public class zad19 {
    public static void main(String[] args) {
//        Zadanie 19
//Napisz program, który wyświetla tajny komunikat. Zanim wyświetli komunikat prosi o
//podanie hasła liczbowego (sam wymyśl jakie ma być hasło). W przypadku wprowadzenia
//niepoprawnego hasła program pyta ponownie o liczbę tak długo dopóki użytkownik nie
//wpisze poprawnego hasła.

        Scanner scanner= new Scanner(System.in);

        int password= 987;
        int guess =1;
        while (guess!=password){
            System.out.println("Podaj hasło liczbowe");
            guess = scanner.nextInt();
        }
        System.out.println("Dobra robota, idź spać");
    }
}
