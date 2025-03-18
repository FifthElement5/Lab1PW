package Zad2_;

import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();

        if(liczba <= 1) {
            System.out.println("Nie jest pierwsza");
        } else {
            boolean jestPierwsza = true;
            for (int i = 2; i <= Math.sqrt(liczba); i++) {
                if (liczba % i == 0) {
                    System.out.println("Nie jest pierwsza. ");
                    jestPierwsza = false;
                    break;
                }
            }
            if(jestPierwsza) {
                System.out.println("Jest liczba pierwsza");
            }


        }
        scanner.close();
    }

}

