package Zad4_;

public class Space3D extends Space2D {
    double z;

    public Space3D() {
        super();
        this.z = 0;
    }
    public Space3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Nadpisanie metody rysuj() w wersji 3D
    @Override
    public void rysuj() {
        System.out.println("[" + this.x + "," + this.y + "," + this.z + "]");
    }

    //oblicznie odleglosci

    public double odleglosc(Space3D inny) {
        return Math.sqrt(Math.pow(this.x - inny.x, 2) + Math.pow(this.y - inny.y, 2) + Math.pow(this.z - inny.z, 2));
    }


    public double odlegloscO() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ", " + this.z + ")";
    }

    //stayczna metoda obwod
    public static double obwodT(Space3D p1, Space3D p2, Space3D p3) {
        double odleglosc1 = p1.odleglosc(p2);
        System.out.println("bok1: " + odleglosc1);
        double odleglosc2 = p2.odleglosc(p3);
        System.out.println("bok2: " + odleglosc2);
        double odleglosc3 = p3.odleglosc(p1);
        System.out.println("bok3: " + odleglosc3);

        return odleglosc1 + odleglosc2 + odleglosc3;
    }

    public static double poleT(Space3D p1, Space3D p2, Space3D p3) {
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
