package com.complexity.bigo;

public class BigOLinearTime {
    public void log(int[] numbers, String[] names) {
        // O(n)
        for (int number : numbers) {
            System.out.println(number);
        }

        // O(1 + n + 1) = O(2 + n) = O(n)
        System.out.println();   // O(1)
        for (int number : numbers) {    // O(n)
            System.out.println(number);
        }
        System.out.println();   // O(1)

        // O(n + n) = O(2n) = O(n)
        for (int number : numbers) {    // O(n)
            System.out.println(number);
        }
        for (int number : numbers) {    // O(n)
            System.out.println(number);
        }

        // O(n + m) = O(n + n) = O(2n) = O(n)
        for (int number : numbers) {    // O(n)
            System.out.println(number);
        }
        for (String name : names) {     // O(m)
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        // Reuse the static array from A_BigO_of1
        int[] numbers = BigOConstantTime.numbers;

        // Add names array
        String[] names = {"Alice", "Bob", "Charlie"};

        BigOLinearTime demo = new BigOLinearTime();
        demo.log(numbers, names); // Pass both parameters
    }
}
