package Zad4_;

public class Space2D {
    double x;
    double y;

    //konstrukotry
    Space2D() {
        this.x = 0;
        this.y = 0;
    }
    Space2D(double x_, double y_) {
        this.x = x_;
        this.y = y_;
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


public void rysuj() {
        System.out.println("[" + this.x + "," + this.y + "]");
}

    public double odleglosc(Space2D inny) {
        return Math.sqrt(Math.pow(this.x - inny.x, 2) + Math.pow(this.y - inny.y, 2));
    }

    // Oblicza odległość od punktu (0,0)
    public double odlegloscO() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    //stayczna metoda obwod
public static double obwodT(Space2D p1, Space2D p2, Space2D p3) {
    double odleglosc1 = p1.odleglosc(p2);
    System.out.println("bok1: " + odleglosc1);
    double odleglosc2 = p2.odleglosc(p3);
    System.out.println("bok2: " + odleglosc2);
    double odleglosc3 = p3.odleglosc(p1);
    System.out.println("bok3: " + odleglosc3);

    return odleglosc1 + odleglosc2 + odleglosc3;
}

    public static double poleT(Space2D p1, Space2D p2, Space2D p3) {
        double odleglosc1 = p1.odleglosc(p2);
        System.out.println("bok1: " + odleglosc1);
        double odleglosc2 = p2.odleglosc(p3);
        System.out.println("bok2: " + odleglosc2);
        double odleglosc3 = p3.odleglosc(p1);
        System.out.println("bok3: " + odleglosc3);

        double polowa =  (odleglosc1 + odleglosc2 + odleglosc3)/2;
        double pole = Math.sqrt(polowa * (polowa - odleglosc1) * (polowa - odleglosc2) * (polowa - odleglosc3));
        return pole;

    }

}
