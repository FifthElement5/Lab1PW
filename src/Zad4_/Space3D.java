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
}
