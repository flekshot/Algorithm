public class MySolutions {

    // Problem 1: Find the smallest number in an array
    public static int findSmallest(int[] numbers, int size) {
        // If only one number, it’s the smallest
        if (size == 1) {
            return numbers[0];
        }
        // Compare the last number with the smallest of the rest
        int smaller = findSmallest(numbers, size - 1);
        return Math.min(numbers[size - 1], smaller);
        // Time: O(n) - we check each number once
    }

    // Problem 2: Find the average of numbers in an array
    public static double findAverage(int[] numbers, int size) {
        // Add all numbers up and divide by how many there are
        int total = addNumbers(numbers, size);
        return (double) total / size;
        // Time: O(n) - we add each number once
    }

    // Helper for Problem 2 to add numbers
    private static int addNumbers(int[] numbers, int size) {
        if (size == 1) {
            return numbers[0];
        }
        return numbers[size - 1] + addNumbers(numbers, size - 1);
    }

    // Problem 3: Check if a number is prime (only divisible by 1 and itself)
    public static String isPrime(int number) {
        if (number <= 1) {
            return "Composite"; // 1 or less isn’t prime
        }
        if (checkDivisors(number, number - 1)) {
            return "Prime";
        } else {
            return "Composite";
        }
        // Time: O(n) - we check all numbers below it
    }

    // Helper for Problem 3
    private static boolean checkDivisors(int number, int divisor) {
        if (divisor == 1) {
            return true; // No divisors found, it’s prime
        }
        if (number % divisor == 0) {
            return false; // Found a divisor, not prime
        }
        return checkDivisors(number, divisor - 1);
    }

    // Problem 4: Find factorial (like 5! = 5 * 4 * 3 * 2 * 1)
    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1; // 0! and 1! are both 1
        }
        return number * factorial(number - 1);
        // Time: O(n) - we multiply n times
    }

    // Problem 5: Find the nth Fibonacci number (0, 1, 1, 2, 3, 5, ...)
    public static int fibonacci(int number) {
        if (number == 0) {
            return 0; // First number
        }
        if (number == 1) {
            return 1; // Second number
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
        // Time: O(2^n) - it grows really fast because of two calls
    }

    // Problem 6: Calculate a to the power n (like 2^3 = 8)
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Anything to power 0 is 1
        }
        return base * power(base, exponent - 1);
        // Time: O(n) - we multiply n times
    }

    // Problem 7: Reverse an array (like [1, 2, 3] becomes [3, 2, 1])
    public static void reverseArray(int[] numbers, int start, int end) {
        if (start >= end) {
            return; // Stop when we meet in the middle
        }
        // Swap the numbers at start and end
        int temp = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;
        reverseArray(numbers, start + 1, end - 1);
        // Time: O(n) - we swap half the array
    }

    // Problem 8: Check if a string is all numbers (like "123" yes, "12a" no)
    public static String isAllDigits(String text, int position) {
        if (position == text.length()) {
            return "Yes"; // Checked all, all were digits
        }
        char letter = text.charAt(position);
        if (letter < '0' || letter > '9') {
            return "No"; // Found something that’s not a digit
        }
        return isAllDigits(text, position + 1);
        // Time: O(n) - we check each character once
    }

    // Problem 9: Binomial coefficient (combinations, like C(7,3))
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // Base cases
        }
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
        // Time: O(2^n) - two calls make it grow fast
    }

    // Problem 10: Find GCD (greatest common divisor) of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // When b is 0, a is the answer
        }
        return gcd(b, a % b); // Keep dividing until we get there
        // Time: O(log(min(a,b))) - it shrinks fast
    }
}