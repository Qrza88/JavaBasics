import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {

//        Zadanie 14
//Napisz program który oblicza wskaźnik BMI: wzór: waga/wzrost^2. Dodatkowo program ma
//sprawdzić czy BMI jest powyżej 24,9 - nadwaga lub czy BMI jest poniżej 18,5 - niedowaga.
//Poinformuj o każdym działaniu programu

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wagę w kg");
        double weight = scanner.nextDouble();
        System.out.println("Podaj wzrost w metrach");
        double height = scanner.nextDouble();
        double BMI = weight/(height*height);
        if (BMI>24.9){
            System.out.println("Nadwaga");
        } else if(BMI<18.5){
            System.out.println("Niedowaga");
        } else{
            System.out.println("Waga prawidłowa");
        }
        System.out.printf("Twoje BMI: %f :)", BMI);

    }
}
