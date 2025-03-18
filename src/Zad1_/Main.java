package Zad1_;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //int w = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wielkosc strzalki: ");
        int w = scanner.nextInt();

        System.out.println(w);

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < w - i-1; j++) {
                System.out.print(".");
            }
            for (int k = 0; k < (2 * i) +1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < w-1; j++) {
                System.out.print(".");
            }
            for (int k = 0; k < 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
