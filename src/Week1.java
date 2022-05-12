/*
Aufgabe 1:
a) [1, 2, 17, 4, -1, -2, -3, -4]  //begründung, falls nötig: "Reference" ist zugewiesen und nicht der Wert.
b)
	Teil A:
        Fehler in Zeile: #9, auf a[a.length] kann man nicht zugreifen, "out of bounds".
        Richtig: for (int i=0;i<a.length;i++)
	Teil B:
        Fehler in Zeile:---
        Richtig:---
	Teil C:
        Fehler in Zeile: #23 Iterator "i" beginnt bei 1, m[0] würde so übersprungen werden und außerdem würde man am Ende außerhalb des Felds treten.
        Richtig: m[i-1]=val / 3;
	Teil D:
        Fehler in Zeile: #27. Wenn alle Werte negativ sind ist die Ausgabe falsch.
        Richtig: int max = Integer.MIN_VALUE;
	Teil E:
        Fehler in Zeile: #36 Erstes von Null "verschiedenes" Element ist gesucht.
        Richtig: (i<a.length && a[i]==0) i++;

c) private static void splitAccordingToIndex(int[] numbers) ----- unten.
d) private static void splitAccordingToEvenness(int[] numbers) ----- unten.

*/


public class Week1 {
    public static void main(String[] args) {

        //Aufgabe 1c
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Odd and even indexed elements split into two arrays: ");
        splitAccordingToIndex(numbers);

        numbers = new int[]{5, 3, 1, 4, 6, 2, 8};

        //Aufgabe 1d
        System.out.println("Odd and even elements of the array split into two arrays: ");
        splitAccordingToEvenness(numbers);


        //Aufgabe 2
        int i = 0;
        java.util.Scanner s = new java.util.Scanner((System.in));
        System.out.print("Which Fibonacci number do you want?: ");
        i = s.nextInt();
        System.out.println(i + ". Fibonacci number: " + fibonacci(i));

        //Aufgabe 3
        System.out.print("How many people are there in the party?: ");
        i = s.nextInt();
        System.out.print(prost(i));
    }

    private static void splitAccordingToIndex(int[] numbers) {
        boolean lengthIsOdd = numbers.length % 2 == 1;

        int[] evenIndexed = new int[(numbers.length + (lengthIsOdd ? 1 : 0))/2];
        int[] oddIndexed = new int[(numbers.length)/2];

        int evenIndexCounter = 0;
        int oddIndexCounter = 0;

        for (int i =0; i< numbers.length; i++) {
            if (i%2==0) {
                evenIndexed[evenIndexCounter++] = numbers[i];
            }
            else {
                oddIndexed[oddIndexCounter++] = numbers[i];
            }
        }

        printArraysOnConsole(evenIndexed, oddIndexed);
    }

    private static void splitAccordingToEvenness(int[] numbers) {
        int oddNumbersCount =0;

        for (int number: numbers) {
            if (number % 2 == 1)
                oddNumbersCount++;
        }

        int[] oddNumbers = new int[oddNumbersCount];
        int[] evenNumbers = new int[numbers.length - oddNumbersCount];

        int evenIndexCounter = 0;
        int oddIndexCounter = 0;
        for (int number: numbers) {
            if (number%2 == 0) {
                evenNumbers[evenIndexCounter++] = number;
            }
            else {
                oddNumbers[oddIndexCounter++] = number;
            }
        }

        printArraysOnConsole(oddNumbers, evenNumbers);
    }

    private static void printArraysOnConsole(int[] array1, int[] array2) {
        System.out.print("Array1: ");
        for (int number: array1) {
            System.out.print(number + " ");
        }

        System.out.print("\nArray2: ");

        for (int number: array2) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    public static int fibonacci(int n) {
        if (n<0) {
            System.exit(0);
            return -1;
        }
        else if (n < 2) {
            return n;
        }

        int num1 = 0;
        int num2 = 1;
        int num3 = 1;

        for (int i=2;i<=n;i++) {
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }

        return num3;
    }

    public static int prost(int n) {
        if (n<=1) {
            return 0; //no one to chink with :(
        }
        else if (n==2) {
            return 1;
        }
        else {
            return n-1 + prost(n-1);
        }
    }
}
