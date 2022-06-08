//disclaimer: Test cases shamelessly stolen from D***** M. on Discord (name redacted for privacy)

package week3.koenigreich;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KoenigreichTests {

    @Test
    public void ruleNumber1() {
        Bauer bauer = new Bauer();
        bauer.setEinkommen(100);
        assertEquals(10, bauer.steuer());
    }

    @Test
    public void ruleNumber2FirstSentence() {
        Einwohner einwohner = new Einwohner();
        einwohner.setEinkommen(100);
        assertEquals(10, einwohner.steuer());
    }

    @Test
    public void ruleNumber2SecondSentence() {
        Einwohner einwohner = new Einwohner();
        einwohner.setEinkommen(11);
        assertEquals(1, einwohner.steuer());
    }

    @Test
    public void ruleNumber2ThirdSentence() {
        Einwohner einwohner = new Einwohner();
        einwohner.setEinkommen(0);
        assertEquals(1, einwohner.steuer());

        einwohner.setEinkommen(9);
        assertEquals(1, einwohner.steuer());

        einwohner.setEinkommen(1);
        assertEquals(1, einwohner.steuer());
    }

    @Test
    public void ruleNumber3() {
        Koenig koenig = new Koenig();
        koenig.setEinkommen(100);
        assertEquals(0, koenig.steuer());
    }

    @Test
    public void ruleNumber4() {
        Adel adel = new Adel();
        adel.setEinkommen(0);
        assertEquals(20, adel.steuer());

        adel.setEinkommen(20);
        assertEquals(20, adel.steuer());

        adel.setEinkommen(100);
        assertEquals(20, adel.steuer());

        adel.setEinkommen(1000);
        assertTrue(adel.steuer() > 20);
    }

    @Test
    public void ruleNumber5() {
        Leibeigener leibeigener = new Leibeigener();
        leibeigener.setEinkommen(12);
        assertEquals(1, leibeigener.steuer());
        leibeigener.setEinkommen(32);
        assertEquals(2, leibeigener.steuer());
    }
}