import java.util.Locale;

public class zad12 {
    public static void main(String[] args) {
//Stwórz zmienną typu String i zainicjuj ją dowolnym zdaniem złożonym, a następnie:
//a) wyświetl zdanie dużymi literami,
//b) zapisz w zmiennej odpowiedniego typu ilość symboli w zdaniu,
//c) wyświetl pierwszą i piątą literę w tym zdaniu,
//d) nadpisz stworzoną zmienną tak, żeby zawierała zdanie wielkimi literami,
//e) wyświetl odpowiedź na pytanie czy w zdaniu znajduje się słowo “nie” (true/false),
//f) wyświetl fragment tekstu od znaku 5 do 13,
//g) wyświetl fragment tekstu od znaku 7 do końca,
//h) wyświetl ostatnią literę zdania,
//i) wyświetl zdanie 10 razy wykorzystując odpowiednie metody.

        String str = new String("Lubię sok pomarańczowy, ale z jabłek też lubię");
//       a
        String s = str.toUpperCase(Locale.ROOT);
        System.out.println(s);

//        b
        int s1 = str.length();
        System.out.println(s1);
//        c

        System.out.println("1st letter " +  str.charAt(0));
        System.out.println("5th letter " +  str.charAt(4));
//        d
        System.out.println(str);
        str = str.toUpperCase(Locale.ROOT);

        System.out.println(str);

//        e
        boolean b = str.contains("nie");
        System.out.println(b);
//        f
       String s2 = str.substring(4,12);
        System.out.println(s2);
//        g
        String s3 = str.substring(6);
        System.out.println(s3);
//        h
        int lastLetterIndex = str.length() -1;
        char lastLetter = str.charAt(lastLetterIndex);
        System.out.println(lastLetter);
//      i
//        System.out.println(str.(10)); / repeat na stringu
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);


    }
}
