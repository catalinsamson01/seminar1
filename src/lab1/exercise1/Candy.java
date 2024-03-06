package lab1.exercise1;

import java.util.Arrays;

public class Candy {

    public static void main(String[] args) {

        int m = 3;
        int[] bags = {1, 2, 3, 4, 5, 6, 7};
        int solution = reminder(m, bags);
        System.out.println("Remaining candies: " + solution);
    }

    public static int reminder(int m, int[] bags) {
        int sum = 0;

        for (int i : bags) {
            sum += 1;
        }
        return sum % m;
    }
}
