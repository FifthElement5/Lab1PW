package Zad4_;

public class main {
    public static void main(String[] args) {
        Space2D p1 = new Space2D(4,5);
        Space2D p2 = new Space2D(3,4);
        System.out.println(p1.getX());
        p1.rysuj2D();
        double wynik = p1.odleglosc(p2);
        System.out.println(wynik);

        double wynik1 = p1.odlegloscO();
        System.out.println(wynik1);

        System.out.println(p2.toString());  // Jawne wywołanie metody toString()


    }
}
