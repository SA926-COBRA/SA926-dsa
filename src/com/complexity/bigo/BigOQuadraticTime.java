package com.complexity.bigo;

public class BigOQuadraticTime {
    public void log(int[] numbers) {
        // O(n^2)
        for (int first : numbers) {    // O(n)
            for (int second : numbers) {   // O(n)
                System.out.println(first + ", " + second);
            }
        }

        // O(n + n^2) = O(n^2)
        for (int number : numbers) {    // O(n)
            System.out.println(number);
        }
        for (int first : numbers) {    // O(n)
            for (int second : numbers) {   // O(n)
                System.out.println(first + ", " + second);
            }
        }

        // O(n * n * n) = O(n^3)
        for (int first : numbers) {    // O(n)
            for (int second : numbers) {   // O(n)
                for (int third : numbers) {    // O(n)
                    System.out.println(first + ", " + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Reuse the static array from A_BigO_of1
        int[] numbers = BigOConstantTime.numbers;

        BigOQuadraticTime demo = new BigOQuadraticTime();
        demo.log(numbers);  // Pass the numbers array
    }
}
