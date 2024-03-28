package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {23, 22, 19, 13, 121, 16};

        // ----- Arrays - 1------
        int count = 0;
        double oddSum = 0;
        for (int num: numbers) {
            int sum = 0;
            int temp = num;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum % 2 == 1) {
                count++;
                oddSum += temp;
            }
        }

        System.out.println("Arrays 1-ci task: " + oddSum / count);

        // ------ Arrays - 2 -----
        int firstIndex = 0;
        int lastIndex = numbers.length -1;
        int temp = numbers[0];
        while (firstIndex < lastIndex) {
            temp = numbers[firstIndex];
            numbers[firstIndex] = numbers[lastIndex];
            numbers[lastIndex] = temp;
            firstIndex++;
            lastIndex--;
        }
        System.out.println("Arrays 2-ci task: " + Arrays.toString(numbers));

        // ------ Arrays - 3 -------
        int[] numbers2 = {23, 24, 29, 133, 1221, 1600};
        int min = numbers2[0];
        for (int i = 1; i < numbers2.length; i++) {
            if (numbers2[i] < min) {
                System.out.println("Arrays 3-cu task: Unsorted array");
                break;
            }
            min = numbers2[i];
        }
        if (min == numbers2[numbers2.length-1]) {
            System.out.println("Arrays 3-cu task: Sorted array");
        }
    }
}