package algorithm;

import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 8, 5, 4, 2, 4, 1};
        System.out.println(Arrays.toString(sort(numbers)));
    }

    private static int[] sort(int[] numbers) {
        boolean changed = false;
        for (int index = 0; index < numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            int nextNumber = numbers[index + 1];
            if (currentNumber > nextNumber) {
                numbers[index] = nextNumber;
                numbers[index + 1] = currentNumber;
                changed = true;
            }
        }
        return changed ? sort(numbers) : numbers;
    }
}
