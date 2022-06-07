package week4.pkw;

public class Pickup extends Auto {
    int fassungsVermoegen;
    int ladung;
    protected static final boolean DEFAULT_ISTZWEISITZER = true;

    public Pickup(int fassungsVermoegen) {
        this(fassungsVermoegen, Auto.DEFAULT_KENNZEICHEN);
    }

    public Pickup(int fassungsVermoegen, String kennzeichen) {
        super(kennzeichen, DEFAULT_ISTZWEISITZER);
        if (fassungsVermoegen > 0) {
            this.fassungsVermoegen = fassungsVermoegen;
        }
        else {
            System.out.println("Fehlerhafte Eingabe: Fassungsvermögen kann nicht kleiner als 0 sein.");
            this.fassungsVermoegen = 0;
        }
        ladung=0;
    }

    public int getLadung() {
        return ladung;
    }

    public boolean beladen(int ladung) {
        if (ladung < 0 ) {
            System.out.println("Fehlerhafte Eingabe: Ladung sollte nicht negativ sein.");
            return false;
        }

        int freieKapazitaet = fassungsVermoegen - ladung;
        if (ladung > freieKapazitaet) {
            System.out.println("Unzureichende Lagerfläche.");
            return false;
        }

        this.ladung += ladung;
        System.out.println("Der Pick-up wurde mit " + ladung +  "beladen.");
        return true;
    }

    public void entladen(int ladung) {
        if (ladung < 0) {
            System.out.println("Fehlerhafte Eingabe: Ladung sollte nicht negativ sein.");
            return;
        }

        if (ladung > this.ladung) {
            System.out.println("Fehlerhafte Eingabe: Argument Ladung kann nicht höher als der aktuelle Inhalt der Ladefläche sein.");
            return;
        }

        this.ladung -= ladung;
        System.out.println("Inhalt der Ladefläche wurde um "+ladung+" verringert.");
    }

    public void entladen() {
        entladen(this.ladung);
    }

    @Override
    public void bereiteWaschenVor() {
        super.bereiteWaschenVor();
        entladen();
    }

    @Override
    public String toString() {
        return "Pickup{" +
                "fassungsVermoegen=" + fassungsVermoegen +
                ", kennzeichen=" + getKennzeichen() +
                ", kilometerstand=" + getKilometerstand() +
                ", sitzplaetzen=" + getSitzplaetzen() +
                ", antenneAusgefahren=" + isAntenneAusgefahren() +
                '}';
    }
}
