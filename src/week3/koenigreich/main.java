package week3.koenigreich;

public class main {
    public static void main(String[] args) {
        Einwohner[] einwohner = new Einwohner[20];

        einwohner[1] = new Koenig();
        einwohner[1].setEinkommen(500);  //König zahlt nichts.

        einwohner[2] = new Adel();
        einwohner[2].setEinkommen(10);   //Min steuer für Adel: 20 Gulden.

        einwohner[3] = new Adel();
        einwohner[3].setEinkommen(500);

        einwohner[4] = new Leibeigen();
        einwohner[4].setEinkommen(11);   //Erste 12 Gulden steuerfrei, aber auch wenn Einwohner (außer König) kein versteuerbare Geld haben, ist die Minimumsteuer 1 Gulden.

        einwohner[5] = new Leibeigen();
        einwohner[5].setEinkommen(110);  //Erste 12 Gulden sind steuerfrei.

        einwohner[6] = new Bauer();
        einwohner[6].setEinkommen(100);

        for (int i = 0; i < einwohner.length; i++) {
            if(einwohner[i] == null) {
                continue;
            }

            System.out.println("Einwohner type:"  + einwohner[i].getClass().toString());
            System.out.println("Einkommen:" + einwohner[i].getEinkommen());
            System.out.println("Versteuerbar: " + einwohner[i].zuVersteuerndesEinkommen());
            System.out.println("Steuer: " + einwohner[i].steuer());
        }
    }
}
