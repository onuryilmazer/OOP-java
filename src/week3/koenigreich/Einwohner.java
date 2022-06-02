package week3.koenigreich;

public class Einwohner {
    private int einkommen;

    void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }

    int getEinkommen() {
        return einkommen;
    }

    int zuVersteuerndesEinkommen() {
        return einkommen;
    }

    int steuer() {
        if (this instanceof Koenig) {
            return 0;
        }

        int steuer = (int)(zuVersteuerndesEinkommen() * 0.1); //rundet ab.

        if (steuer < 1) {
            steuer = 1;
        }

        if (steuer < 20 && (this instanceof Adel)) {
            steuer = 20;
        }

        return steuer;
    }


}
