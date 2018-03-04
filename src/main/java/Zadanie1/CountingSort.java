package Zadanie1;

public class CountingSort {
    public static void sort(int[] tablica) {

        int zakres = 255;
        int [] liczniki = new int [zakres];

        for (int i = 0; i < tablica.length; i++) {
            liczniki[tablica[i]]++;
        }

        int pozycjaWstawiania = 0;
        for (int i = 0; i < liczniki.length; i++) {
            for (int j = 0; j < liczniki[i]; j++) {
                tablica[pozycjaWstawiania++] = i;
            }
        }
    }
}
