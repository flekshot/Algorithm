public class Main {
    public static void main(String[] args) {
        // Test Problem 1
        int[] numbers1 = {10, 1, 32, 3, 45};
        System.out.println("Smallest is: " + MySolutions.findSmallest(numbers1, 5));

        // Test Problem 2
        int[] numbers2 = {3, 2, 4, 1};
        System.out.println("Average is: " + MySolutions.findAverage(numbers2, 4));

        // Test Problem 3
        System.out.println("7 is: " + MySolutions.isPrime(7));
        System.out.println("10 is: " + MySolutions.isPrime(10));

        // Test Problem 4 with time (like you asked)
        long start = System.nanoTime(); // Start the clock
        int fact = MySolutions.factorial(5);
        long end = System.nanoTime(); // Stop the clock
        double time = (end - start) / 1000000.0; // Change to milliseconds
        System.out.println("5! is: " + fact);
        System.out.println("Time taken: " + time + " ms");

        // Test Problem 5
        System.out.println("Fibonacci 5 is: " + MySolutions.fibonacci(5));

        // Test Problem 6
        System.out.println("2^10 is: " + MySolutions.power(2, 10));

        // Test Problem 7
        int[] numbers7 = {1, 4, 6, 2};
        MySolutions.reverseArray(numbers7, 0, 3);
        System.out.print("Reversed: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(numbers7[i] + " ");
        }
        System.out.println();

        // Test Problem 8
        System.out.println("123456 all digits? " + MySolutions.isAllDigits("123456", 0));
        System.out.println("123a12 all digits? " + MySolutions.isAllDigits("123a12", 0));

        // Test Problem 9
        System.out.println("C(7,3) is: " + MySolutions.binomial(7, 3));

        // Test Problem 10
        System.out.println("GCD of 3248 and 107 is: " + MySolutions.gcd(3248, 107));
    }
}