package Zadanie1;

public class InsertionSor {
    public static void sort(int[] tablica) {

        for (int i = 2; i < tablica.length; i++) {
            int klucz = tablica[i];
            int j = i - 1;
            while (j >= 0 && tablica[j] > klucz) {
                tablica[j + 1] = tablica[j];
                j = j - 1;
            }
            tablica[j + 1] = klucz;
        }


    }
}
