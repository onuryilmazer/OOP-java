package week2.raumverwaltung;

public class Labor extends Raum {
    private Praktikum[] praktika;

    Labor(int plaetze, Adresse adresse, Praktikum[] praktika) {
        setPlaetze(plaetze);
        setAdresse(adresse);
        setPraktika(praktika);
    }

    public Praktikum[] getPraktika() { return praktika; }

    public void setPraktika(Praktikum[] praktika) { this.praktika = praktika; }
}
