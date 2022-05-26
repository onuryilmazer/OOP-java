package week2.raumverwaltung;

public class Hoersaal extends Raum {
    private Vorlesung[] vorlesungen;

    Hoersaal(int plaetze, Adresse adresse, Vorlesung[] vorlesungen) {
        setPlaetze(plaetze);
        setAdresse(adresse);
        setVorlesungen(vorlesungen);
    }

    public Vorlesung[] getVorlesungen() { return vorlesungen; }

    public void setVorlesungen(Vorlesung[] vorlesungen) { this.vorlesungen = vorlesungen; }
}
