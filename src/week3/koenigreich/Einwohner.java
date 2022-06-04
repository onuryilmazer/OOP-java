package week3.koenigreich;

public class Einwohner {
    void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }
    int getEinkommen() {
        return einkommen;
    }
    private int einkommen;

    private int minimumSteuer = 1;

    int zuVersteuerndesEinkommen() {
        return einkommen;
    }

    int steuer() {
        int steuer = (int)(zuVersteuerndesEinkommen() * 0.1); //typecasting rundet ab.

        if (steuer < minimumSteuer) {
            return minimumSteuer;
        }

        return steuer;
    }
}
