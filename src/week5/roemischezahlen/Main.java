package week5.roemischezahlen;

public class Main {
    public static void main(String[] args) {
        Roman[] numbers = new Roman[11];

        numbers[0] = new Roman("III"); //3
        numbers[1] = new Roman("LVIII"); //58
        numbers[2] = new Roman("MCMXCIV"); //1994

        numbers[3] = new Roman(3);
        numbers[4] = new Roman(58);
        numbers[5] = new Roman(1994);

        numbers[6] = Roman.add(numbers[0], numbers[1]); //61
        numbers[7] = Roman.multiply(numbers[2], numbers[0]); //5982

        numbers[8] = new Roman("IC"); //99 alternative representation.
        numbers[9] = new Roman("XCIX"); //99 standard repr.
        numbers[10] = new Roman("");  //0.

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("------------------------------------");

        try {
            System.out.println(Roman.subtract(numbers[0], numbers[1])); //-55, negative result, throws an error.
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }

        System.out.println(Roman.divide(new Roman(100), new Roman(5))); // 20.

        System.out.println("------------------------------------");

        boolean equals = numbers[8].equals(numbers[9]); //should be false (acc. to my implementation)
        System.out.println("Alternative representations of the same value are considered equal: " + equals);
    }
}
