package Zadanie1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tablica = new int[] {18, 20, 72, 3, 5, 70, 5};
        BubbleSort.sort(tablica);
        System.out.println(Arrays.toString(tablica));
        CountingSort.sort(tablica);
        System.out.println(Arrays.toString(tablica));
        InsertionSor.sort(tablica);
        System.out.println(Arrays.toString(tablica));
    }
}
