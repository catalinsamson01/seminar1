package lab1.exercise.allocation;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] cost1 = {20, 90, 40, 90};
        int budget1 = 100;
        int maxHouses = maxHousesToBuy(cost1, budget1);
        System.out.println(maxHouses);
    }

    public static int maxHousesToBuy(int[] costs, int budget) {
        Arrays.sort(costs);

        int numHouses = 0;
        int totalCost = 0;

        for (int cost : costs) {
            if (totalCost + cost <= budget) {
                totalCost += cost;
                numHouses++;
            } else {
                break;
            }
        }
        return numHouses;
    }
}
