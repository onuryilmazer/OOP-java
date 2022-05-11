public class Week1 {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};

        System.out.println("Odd and even indexed elements split into two arrays: ");
        splitAccordingToIndex(numbers);

        numbers = new int[]{5, 3, 1, 4, 6, 2, 8};

        System.out.println("Odd and even elements split into two arrays: ");
        splitAccordingToEvenness(numbers);
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
}
