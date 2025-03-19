package Zad4_;

public class main {
    public static void main(String[] args) {
        Space2D p1 = new Space2D(4,5);
        Space2D p2 = new Space2D(3,4);
        Space2D p3 = new Space2D(3,3);

        System.out.println(p1.getX());
        p1.rysuj();



        double wynik1 = p1.odlegloscO();
        System.out.println("odleglosc od 0 : " + wynik1);

        System.out.println(p2.toString());  // Jawne wywołanie metody toString()

          double obwod = Space2D.obwodT(p1, p2, p3);
          System.out.println("obwod trojkta to : " + obwod);

        double pole = Space2D.obwodT(p1, p2, p3);
        System.out.println("pole trojkat to: " + pole);
System.out.println("3D ////////////////:");
        Space3D punkt1 = new Space3D(1, 2, 3);
        Space3D punkt2 = new Space3D(4, 5, 6);


        punkt1.rysuj();
        double wynik2 = punkt1.odlegloscO();

        System.out.println("odleglosc 3d od 0: " + wynik2);

double wynik3 = punkt1.odleglosc(punkt2);
System.out.println("odleglosc punktu 1 od 2: " + wynik3);

System.out.println(punkt2.toString());

    }
}
