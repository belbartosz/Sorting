package ZadaniaSzyfry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        System.out.println(plot1("bartosz"));
//        System.out.println(szyfr2("WAHITILEKODNIBGSEITNSTOIHGN"));

        szyfr22("abcdefghijkl");

    }

    public static String plot1(String haslo) {
        List<String> tablica = Arrays.asList(haslo.split(""));
        List<String> tablica1 = new ArrayList<>();
        List<String> tablica2 = new ArrayList<>();
        for (int i = 0; i < haslo.length(); i++) {
            if (i % 2 == 0) {
                tablica1.add(tablica.get(i));
            } else {
                tablica2.add(tablica.get(i));
            }
        }
        String s1 = String.join("", tablica1);
        String s2 = String.join("", tablica2);
        String x = s1 + s2;
        return x;
    }

    public static String szyfr2(String haslo) {
        List<String> tablica = Arrays.asList(haslo.split(""));
        List<String> tablica2 = new ArrayList<>(tablica);

        for (int i = 1; i < haslo.length(); i++) {
            if (i % 2 == 1) {
                tablica2.set(i + 1, tablica.get(i));
            } else {
                tablica2.set(i - 1, tablica.get(i));
            }
        }
        String xxx = String.join("", tablica2);
        return xxx;
    }

    public static void szyfr22(String haslo) {
        List<String> tablica = Arrays.asList(haslo.split(""));
        System.out.print(tablica.get(0));
        for (int i = 1; i < haslo.length() - 1; i += 2) {
            System.out.print(tablica.get(i + 1));
            System.out.print(tablica.get(i));
        }
        if (haslo.length() % 2 == 0) {
            System.out.println(tablica.get(haslo.length() - 1));
        }
    }
}
