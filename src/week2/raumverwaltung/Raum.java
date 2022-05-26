package week2.raumverwaltung;

public abstract class Raum {
    private int plaetze;
    private Adresse adresse;

    public int getPlaetze() { return plaetze; }

    public void setPlaetze(int plaetze) { this.plaetze = plaetze; }

    public Adresse getAdresse() { return adresse; }

    public void setAdresse(Adresse adresse) { this.adresse = adresse; }
}
