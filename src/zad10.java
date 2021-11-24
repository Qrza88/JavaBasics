public class zad10 {
    public static void main(String[] args) {
//
//        Zadanie 10
//        Zadeklaruj zmienne typu int, long oraz double i zainicjalizuj je dowolnymi wartościami
//        liczbowymi. Spróbuj wstawić do zmiennej typu long wartość zmiennej typu int. Następnie
//        spróbuj wykonać operację odwrotną. Czy obie instrukcje działają? Jeśli jakaś powoduje błąd
//        kompilacji, wyłącz ją wykorzystując komentarz liniowy.

        int i = 4;
        long l = 65;
        double d = 6.5;

        l = i;
//        i = l; tym zmiennej int ma mniejszy zakres niż zmiennyj long dlatego nie można przypisać jej wartości long


    }
}
