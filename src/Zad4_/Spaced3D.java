package Zad4_;

public class Spaced3D extends Space2D {
    double z;

    public Spaced3D() {
        super();
        this.z = 0;
    }
    public Spaced3D(double x, double y, double z) {
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
    void rysuj() {
        System.out.println("[" + this.x + "," + this.y + "," + this.z + "]");
    }
}
