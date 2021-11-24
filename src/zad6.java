public class zad6 {
//    Wróć do kodu z zadania 2 i zastanów się jak mógłbyś napisać kod, który:
//a) dodaje do zmiennej przechowującej wynik jeszcze raz pierwszą z liczb,
//b) przemnaża wynik przez drugą z liczb,
//c) zmienia znak na przeciwny,
//d) zamienia wartości z dwóch różnych zmiennych miejscami.


    public static void main(String[] args) {
        System.out.println("Będę liczyć");
        int a = 20;
        int b = 5;
        int c = 12;
        int result = a +b + c;
        System.out.printf( "%d + %d + %d = %d\n", a,b,c, result);

//        a
        System.out.println(result + a);
//        b

        System.out.println(result * b);
//        c
        System.out.println( -result);
//        d
        int x = a;
        a = b;
        b = x;
        System.out.printf( "a= %d b=%d", a,b);
    }
}
