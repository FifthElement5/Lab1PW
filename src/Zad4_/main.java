package Zad4_;

public class main {
    public static void main(String[] args) {
        Space2D p1 = new Space2D(4,5);
        Space2D p2 = new Space2D(3,4);
        Space2D p3 = new Space2D(3,3);

        System.out.println(p1.getX());
        p1.rysuj2D();



        double wynik1 = p1.odlegloscO();
        System.out.println(wynik1);

        System.out.println(p2.toString());  // Jawne wywołanie metody toString()

        double odleglosc1 = p1.odleglosc(p2);
        System.out.println("bok1: " + odleglosc1);
        double odleglosc2 = p2.odleglosc(p3);
        System.out.println("bok2: " + odleglosc2);
        double odleglosc3 = p3.odleglosc(p1);
        System.out.println("bok3: " + odleglosc3);

        obwodT()

    }
}
