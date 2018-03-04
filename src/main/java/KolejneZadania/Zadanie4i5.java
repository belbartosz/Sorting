package KolejneZadania;

public class Zadanie4i5 {
    public static void main(String[] args) {

        System.out.println(silnia(5));
        System.out.println(ciagFibo(7));


    }

    static int silnia(int n) {
        if (n == 1) {
            return 1;
        }
        return silnia(n - 1) * n;
    }

    static int ciagFibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return ciagFibo(n - 1) + ciagFibo(n - 2);
        }
    }
}