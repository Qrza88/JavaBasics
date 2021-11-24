public class zad4 {
//    Napisz program kalkulator, który wyświetli komunikat: “będę liczyć” oraz wykona działanie
//dodawania na trzech wcześniej zadeklarowanych zmiennych liczbowych, zainicjalizowanych
//liczbami: 20, 5, 12. Następnie zainicjuj zmienną “wynik” jako sumę uprzednio podanych liczb
//oraz wyświetl ją.

    public static void main(String[] args) {
        System.out.println("Będę liczyć");
        int a = 20;
                int b = 5;
                        int c = 12;
                        int result = a +b + c;
                        System.out.printf( "%d + %d + %d = %d", a,b,c, result);
    }
//    %d opis liczby dla funkcji printf
}
//Zadanie 5
//Przetestuj jakie znaki możesz wstawić zamiast “+” i sprawdź, jaki efekt będzie miało to na
//otrzymany wynik. zapis z funkcją printf