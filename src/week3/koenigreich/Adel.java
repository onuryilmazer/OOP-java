package week3.koenigreich;

public class Adel extends Einwohner {
    @Override
    int steuer() {
        int steuer = super.steuer();

        if (steuer < minimumSteuer) {
            return minimumSteuer;
        }

        return steuer;
    }

    private int minimumSteuer = 20;
}
