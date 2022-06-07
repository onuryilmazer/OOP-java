package week4.pkw;

public class Auto {
    String kennzeichen;
    int kilometerstand;
    int sitzplaetzen;
    boolean antenneAusgefahren;
    protected static final String DEFAULT_KENNZEICHEN = "J-AA 01";
    protected static final boolean DEFAULT_ISTZWEISITZER = false;

    public Auto() { //Java doesn't support default parameters??? Really?
        this(Auto.DEFAULT_KENNZEICHEN, Auto.DEFAULT_ISTZWEISITZER);
    }

    public Auto(boolean istZweisitzer) {
        this(Auto.DEFAULT_KENNZEICHEN, istZweisitzer);
    }

    public Auto(String kennzeichen) {
        this(kennzeichen, Auto.DEFAULT_ISTZWEISITZER);
    }

    public Auto(String kennzeichen, boolean istZweisitzer) {
        this.kennzeichen = kennzeichen;

        if (istZweisitzer) {
            this.sitzplaetzen = 2;
        }
        else {
            this.sitzplaetzen = 5;
        }

        this.kilometerstand = 0;
        this.antenneAusgefahren = false;
    }

    public String getKennzeichen() {
        return kennzeichen; //Strings are objects, but they're immutable, so returning a direct reference doesn't break encapsulation.
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public int getSitzplaetzen() {
        return sitzplaetzen;
    }

    public boolean isAntenneAusgefahren() {
        return antenneAusgefahren;
    }

    public void fahre(int kilometer) {
        if (kilometer > 0) {
            kilometerstand += kilometer;
            System.out.println("Das Auto hat eine Strecke von " + kilometer + " km. zurückgelegt.");
        }
        else {
            System.out.println("Ungültige Kilometereingabe.");
        }
    }

    public void fahreAntenneAus() {
        if (!antenneAusgefahren) {
            antenneAusgefahren = true;
            System.out.println("Antenne wurde ausgefahren.");
        }
        else {
            System.out.println("Antenne ist bereits ausgefahren.");
        }
    }

    public void fahreAntenneEin() {
        if (antenneAusgefahren) {
            antenneAusgefahren = false;
            System.out.println("Antenne wurde eingefahren.");
        }
        else {
            System.out.println("Antenne ist bereits eingefahren.");
        }
    }

    public void bereiteWaschenVor() {
        //if(antenneAusgefahren) {...
        fahreAntenneEin();
    }

    public void wasche() {
        bereiteWaschenVor();
        System.out.println("Das Auto wird gewaschen.");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "kennzeichen='" + kennzeichen + '\'' +
                ", kilometerstand=" + kilometerstand +
                ", sitzplaetzen=" + sitzplaetzen +
                ", antenneAusgefahren=" + antenneAusgefahren +
                '}';
    }
}
