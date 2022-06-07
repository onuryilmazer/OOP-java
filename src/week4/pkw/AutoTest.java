package week4.pkw;

public class AutoTest {
    public static void main (String[] args) {
        Auto[] autos = new Auto[10];

        //testing constructors
        autos[1] = new Auto();
        autos[2] = new Auto(true);
        autos[3] = new Auto("B-OK 01");
        autos[4] = new Auto("B-OS 01", true);
        autos[5] = new Pickup(500);
        autos[6] = new Pickup(-10, "B-AL 01");

        for(Auto auto : autos) {
            if (auto == null) continue;

            System.out.println(auto.toString());
        }

        for(Auto auto : autos) {
            if (auto==null) continue;

            auto.fahre(50);
            auto.fahreAntenneEin();
            auto.fahreAntenneAus();
            auto.wasche();
        }

        for(Auto auto : autos) {
            if (auto == null) continue;

            System.out.println(auto.toString());
        }
    }
}
