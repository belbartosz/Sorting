package Zadanie1;

public class BubbleSort {
    public static void sort(int[] tablica) {

        int n = tablica.length;
        do {
            for (int i = 0; i < n - 1; i++) {
                if (tablica[i] > tablica[i + 1]) {
                    int a = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = a;
                }
            }
            n = n -1;
        } while (n > 1);

    }
}
