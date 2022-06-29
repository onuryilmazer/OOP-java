package week7.abstraktevererbung;

public class Tetrapack extends Behaeltnis{
    private double width;
    private double depth;
    private double height;

    Tetrapack(double width, double depth, double height) {
        if (width <= 0 || depth <= 0 || height <= 0) {
            System.out.println("Eingabe inakzeptabel, Dimensionen werden auf 0 gesetzt.");
            width = 0; depth = 0; height = 0;
        }
        else {
            this.width = width;
            this.depth = depth;
            this.height = height;
        }
    }

    @Override
    public double volumen() {
        return width * depth * height;
    }

    @Override
    public void println() {
        System.out.println("Tetrapack - Weite: " + width + ", Hoehe: " + height + ", Tiefe: " + depth + ", Volumen: " + volumen());
    }
}
