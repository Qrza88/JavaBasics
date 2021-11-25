public class zad22 {
    public static void main(String[] args) {
//        Napisz program, który sprawdzi czy w tablicy intów znajduje się podana liczba, nie korzytaj z gotowych metod.

        int[] array = new int[]{1, 3, 5, 7, 10, 15};
        int x = 5;

        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                System.out.println("Liczba " + x + " znajduje się w tablicy");
                return;
            }
        }
        System.out.println("Liczba " + x + " nie znajduje się w tablicy");
    }
}

