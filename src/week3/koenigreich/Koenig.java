package week3.koenigreich;

public class Koenig extends Einwohner {
    @Override
    int steuer() {
        return 0;
    }

    @Override
    int zuVersteuerndesEinkommen() {
        return 0;
    }

    private int minimumSteuer = 0;
}
