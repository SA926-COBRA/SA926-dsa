package com.complexity.bigo;

public class BigOConstantTime {

    public static int[] numbers = {1, 2, 3, 4, 5}; // Declare the array as static

    public void log(int[] numbers) {
        // O(1) + O(1) + O(1) + O(1) + O(1) = O(5) = O(1)
        System.out.println(numbers[4]); // O(1)
    }

    public static void main(String[] args) {
        BigOConstantTime demo = new BigOConstantTime();
        demo.log(numbers);
    }
}
