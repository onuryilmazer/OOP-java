package week3.koenigreich;

public class Leibeigen extends Bauer {

    @Override
    int zuVersteuerndesEinkommen() {
        if (getEinkommen() < 12) {
            return 0;
        }
        else {
            return getEinkommen() - 12;
        }
    }

}
