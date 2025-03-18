package Zad4_;

public class main {
    public static void main(String[] args) {
        Space2D p1 = new Space2D(4,5);
        Space2D p2 = new Space2D(3,4);
        System.out.println(p1.getX());
        p1.rysuj2D();
        double wynik = p1.odleglosc(p2);
        System.out.println(wynik);

    }
}
