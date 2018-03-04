package KolejneZadania;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        wyszukiwanieNajwiekszegoDzielnika();

    }

    static void wyszukiwanieNajwiekszegoDzielnika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj calkowita liczbe nieujemna wieksza od 2");
        int liczba = scanner.nextInt();
        int nowaLiczba = 0;
        for (int i = 3; i < liczba; i++) {
            if (liczba % i == 0) {
                nowaLiczba = i;
            }
        }
        System.out.println("najwiekszy dzielnik liczby " + liczba + " to " + nowaLiczba);
    }
}
