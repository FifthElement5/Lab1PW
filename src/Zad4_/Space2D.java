package Zad4_;

public class Space2D {
    int x;
    int y;

    //konstrukotry
    Space2D() {
        this.x = 0;
        this.y = 0;
    }
    Space2D(int x_, int y_) {
        this.x = x_;
        this.y = y_;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
void rysuj2D() {
        System.out.println("[" + this.x + "," + this.y + "]");
}

    public double odleglosc(Space2D inny) {
        return Math.sqrt(Math.pow(this.x - inny.x, 2) + Math.pow(this.y - inny.y, 2));
    }
}
