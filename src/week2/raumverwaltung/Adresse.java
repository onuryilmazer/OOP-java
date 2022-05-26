package week2.raumverwaltung;

public class Adresse {
    private String strasse;
    private String postleitzahl;
    private String ort;

    Adresse(String strasse, String postleitzahl, String ort) {
        setStrasse(strasse);
        setPostleitzahl(postleitzahl);
        setOrt(ort);
    }


    public String getStrasse() { return strasse; }

    public void setStrasse(String strasse) { this.strasse = strasse; }

    public String getPostleitzahl() { return postleitzahl; }

    public void setPostleitzahl(String postleitzahl) { this.postleitzahl = postleitzahl; }

    public String getOrt() { return ort; }

    public void setOrt(String ort) { this.ort = ort; }
}
