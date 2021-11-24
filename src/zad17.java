import java.util.Random;
import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
//        Zadanie 17
//Zrób grę w zgadywanie, w której program losuje liczbę od 1 do 10, a gracz ma 2 próby aby
//zgadnąć liczbę. W przypadku każdej odpowiedzi gracz dostaje informację zwrotną: za
//wysoko/za nisko/trafiona. DODATKOWO: Ulepsz grę aby pytała tylko raz jeśli od razu trafisz
//i mówiła dodatkowo: “gorąco!” jeśli byłeś blisko oraz “zimno…” jeśli byłeś daleko.

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(10);

        for (int i = 0; i < 2; i++) {
            System.out.println("Podaj liczbę od 1 do 10");
            int guess = scanner.nextInt();
            if(guess>number ){
                System.out.println("Za wysoko");
            } else if (guess<number){
                System.out.println("Za nisko");
            } else {
                System.out.println("Trafiona");
                return;
            }
            if(guess-number>2 || number-guess>2){
                System.out.println("Zimno");

            } else {
                System.out.println("Gorąco");
            }
        }

        System.out.printf("Nie tym razem, łamago! To było %d", number);

    }

}
