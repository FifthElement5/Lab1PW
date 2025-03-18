package Zad3_;

import java.util.Random;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rozmiar tablicy: ");
        int N = scanner.nextInt();
//a stworz tablice
        int[] tablica = new int[N];
        for(int i =0; i < N; i++) {
            Random random = new Random();
            int liczba = random.nextInt(10);
            tablica[i] = liczba;
        }
        //wypisz zawartosc

        for (int i = 0; i < N; i++) {
            System.out.println(" nr" + i + " " +tablica[i]);
        }
        //znajdz najmniejszy i najwiekszy element
        int min = tablica[0];
        int max = tablica[0];

        for(int i = 0; i < N; i++) {
            if(tablica[i] < min ) {
                min = tablica[i];
            }
            if(tablica[i] > max)
            {
                max = tablica[i];
            }
        }

        System.out.println("MIN to: " + min);
        System.out.println("MAX to: " + max);

        System.out.println("3 najwieksze liczby: ");
        int min1 = Integer.MIN_VALUE;
        int min2 = Integer.MIN_VALUE;
        int min3 =Integer.MIN_VALUE;

        for (int liczba2 : tablica) {
            if(liczba2 >= min1) {
                min3 = min2;
                min2 = min1;
                min1 = liczba2;
            } else if (liczba2 >= min2) {
                min3 = min2;
                min2 = liczba2;
            } else if (liczba2 >= min3) {
                min3 = liczba2;
            }
        }

        //srednia arytmetyczna
        System.out.println(" 1= " + min1 + " 2= " + min2 + " 3= " + min3);
        int suma = 0;
        for(int i = 0; i < N; i++) {
            suma += tablica[i];
        }
        float srednia = (float) suma/N;
        System.out.println(srednia);

        for(int i = N - 1; i >= 0; i--)
        {
        System.out.println("nr" + i + " " + tablica[i]);
        }

        for (int i = 0; i < N / 2; i++) {
            int temp = tablica[i];
            tablica[i] = tablica[N - 1 - i];
            tablica[N - 1 - i] = temp;
        }

        // Wypisanie odwróconej tablicy
        for (int num : tablica) {
            System.out.print(num + " ");
        }

    }
}

