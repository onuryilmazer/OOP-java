package week7.abstraktevererbung;

public class Dose extends Behaeltnis{
    private double radius;
    private double height;

    Dose(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            System.out.println("Eingabe inakzeptabel, Dimensionen werden auf 0 gesetzt.");
            radius = 0; height = 0;
        }
        else {
            this.radius = radius;
            this.height = height;
        }
    }

    @Override
    public double volumen() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public void println() {
        System.out.println("Dose - Radius: " + radius + ", Hoehe: " + height + ", Volumen: " + volumen());
    }
}
