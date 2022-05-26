package week2.raumverwaltung;

public class Seminarraum extends Raum {
    private Uebung[] uebungen;

    Seminarraum(int plaetze, Adresse adresse, Uebung[] uebungen) {
        setPlaetze(plaetze);
        setAdresse(adresse);
        setUebungen(uebungen);
    }

    public Uebung[] getUebungen() { return uebungen; }

    public void setUebungen(Uebung[] uebungen) { this.uebungen = uebungen; }
}
