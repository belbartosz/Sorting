package KolejneZadania;

public class Zadanie6 {
    public static void main(String[] args) {

        System.out.println(dzielIzwyciezaj(new int[]{2, 4, 6, 8, 9}, 8));

    }

    static int dzielIzwyciezaj(int[] tablica, int liczba) {
        int lewo = 0, srodek = 0, prawo = tablica.length - 1;
        while (lewo <= prawo) {
            srodek = (lewo + prawo) / 2;
            if (tablica[srodek] == liczba) {
                return srodek;
            } else if (srodek < liczba) {
                lewo = srodek + 1;
            } else
                prawo = srodek - 1;
        }
        return -1;
    }
}
