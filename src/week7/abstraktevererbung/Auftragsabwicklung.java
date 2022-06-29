package week7.abstraktevererbung;

public class Auftragsabwicklung {
    public static void main(String args[]) {
        final double produktion = 200; // Wochenproduktion

        Behaeltnis[] bestellung = {
                new Tetrapack(2.3, 0.9, 0.7), new Dose(0.59 , 1.15),
                new Dose(0.59 , 1.15), new Tetrapack(1.1, 0.7, 0.7) // ...
        };

        for (int i = 0; i < bestellung.length; i++) {
            bestellung[i].println();
        }
        // berechne das Gesamtvolumen der Bestellung
        // und die Restmenge der Wochenproduktion
        // >>> Diesen Programmteil sollen Sie hier ergaenzen! <<<

        double gesamtvolumen = 0;

        for(Behaeltnis beh : bestellung) {
            if (beh == null) { continue; }

            gesamtvolumen += beh.volumen();
        }

        System.out.println("Gesamtvolumen der Bestellung: " + gesamtvolumen);
        System.out.println("Differenz mit der Wochenproduktion: " + (produktion - gesamtvolumen));
    }
}
