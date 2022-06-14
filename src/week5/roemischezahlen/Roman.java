package week5.roemischezahlen;

import java.util.HashMap;

public class Roman {
    private String romanNumeral;
    private int decimalValue;

    public int getDecimalValue() {
        return decimalValue;
    }

    public String getRomanNumeral() {
        return romanNumeral;
    }

    public void setRomanNumeral(String romanNumeral) {
        this.romanNumeral = romanNumeral;
        this.decimalValue = convertRomanToDecimal(this.romanNumeral);
    }

    public void setDecimalValue(int decimalValue) {
        this.decimalValue = decimalValue;
        this.romanNumeral = convertDecimalToRoman(this.decimalValue);
    }

    public Roman(String romanNumeral) {
        this.romanNumeral = romanNumeral;
        this.decimalValue = convertRomanToDecimal(romanNumeral);
    }

    public Roman(int decimalValue) {
        this.decimalValue = decimalValue;
        this.romanNumeral = convertDecimalToRoman(decimalValue);
    }

    public static Roman add(Roman a, Roman b) {
        return new Roman(a.decimalValue + b.decimalValue);
    }

    public static Roman subtract(Roman a, Roman b) {
        return new Roman(a.decimalValue - b.decimalValue);
    }

    public static Roman multiply(Roman a, Roman b) {
        return new Roman(a.decimalValue * b.decimalValue);
    }

    public static Roman divide(Roman a, Roman b) {
        return new Roman(a.decimalValue / b.decimalValue);
    }

    @Override
    public String toString() {
        return this.romanNumeral + " (" + this.decimalValue + ")";
    }

    @Override
    public int hashCode() {
        return this.decimalValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Roman)) { return false; }

        Roman romanType = (Roman) obj;

        if (this.decimalValue == romanType.decimalValue && this.romanNumeral.equals(romanType.romanNumeral)) {
            return true;
        }
        else {
            return false;
        }
    }


    private static HashMap<Integer, String> decimalToRoman = new HashMap<>();
    private static HashMap<Character, Integer> romanToDecimal = new HashMap<>();

    static {
        decimalToRoman.put(1000, "M");
        decimalToRoman.put(900, "CM");
        decimalToRoman.put(500, "D");
        decimalToRoman.put(400, "CD");
        decimalToRoman.put(100, "C");
        decimalToRoman.put(90, "XC");
        decimalToRoman.put(50, "L");
        decimalToRoman.put(40, "XL");
        decimalToRoman.put(10, "X");
        decimalToRoman.put(9, "IX");
        decimalToRoman.put(5, "V");
        decimalToRoman.put(4, "IV");
        decimalToRoman.put(1, "I");

        romanToDecimal.put('I', 1);
        romanToDecimal.put('V', 5);
        romanToDecimal.put('X', 10);
        romanToDecimal.put('L', 50);
        romanToDecimal.put('C', 100);
        romanToDecimal.put('D', 500);
        romanToDecimal.put('M', 1000);
    }

    public static int largestKeySmallerThanOrEqual(int number, HashMap<Integer,String> map) {
        int largest = Integer.MIN_VALUE;

        for (int key : map.keySet()) {
            if (key <= number && key > largest) {
                largest = key;
            }
        }

        return largest;
    }

    public static String convertDecimalToRoman(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Roman numerals can't be negative.");
        }

        String roman = "";

        while (number > 0) {
            int largestKey = largestKeySmallerThanOrEqual(number, decimalToRoman);
            roman += decimalToRoman.get(largestKey);
            number -= largestKey;
        }

        return roman;
    }

    public static int convertRomanToDecimal(String roman) {
        int sum = 0;
        char[] letters = roman.toCharArray();

        for(int i = 0; i < letters.length; i++) {
            if (i != letters.length - 1) {
                int currentVal = romanToDecimal.get(letters[i]);
                int nextVal = romanToDecimal.get(letters[i+1]);

                if (currentVal >= nextVal) {
                    sum += currentVal;
                }
                else {
                    sum -= currentVal;
                }
            }
            else {
                sum += romanToDecimal.get(letters[i]); //last roman numeral, can't decrease the sum.
            }
        }

        return sum;
    }
}
