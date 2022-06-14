package week5.rechtecken;

public interface IMobileObject {
    void move(double x, double y); //public abstract by default.

    void increase(double scalingFactor);

    void decrease(double scalingFactor);
}
