import java.sql.Array;

public class zad23 {
    public static void main(String[] args) {
//        Stwórz tablicę 10 liczb i wstaw liczby z przedziału 1 - 1000.
////        a) za pomocą pętli wyświetl wszystkie liczby,
////        b) wyświetl tylko liczby większe niż 100,
////        c) wyświetl tylko liczby większe niż 100 i mniejsze niż 500

        int[] array = new int[]{1,130,345,543,656,765,897,965,999,1000};
        for( int el : array){
            System.out.println(el);
        }
        for(int j: array){
            if(j>100)
            System.out.println(j);
        }
        for (int j : array) {
            if (j > 100 && j < 500) {
                System.out.println(j);
        }}}}

