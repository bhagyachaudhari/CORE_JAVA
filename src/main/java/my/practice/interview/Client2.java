package my.practice.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client2 {

    public static void main(String[] args) {
        int[] spins = {5, 4, 3, 2};
        /*int N = spins.length;
        int maxAllowed = Integer.MAX_VALUE;
        int maxSum = 0;

        // 5, 4, 3, 2

        for(int i = N-1; i >= 0; i++) {

            if(spins[i] < maxAllowed) {
                maxSum = maxSum + spins[i];
                maxAllowed = spins[i] - 1;
            } else {
                maxSum = maxSum + maxAllowed;
                maxAllowed = maxAllowed - 1;
            }

            if(maxAllowed == -1) {
                break;
            }
        }

        System.out.println(maxSum);*/

        List<Integer> list = Arrays.stream(spins).mapToObj(i ->(int)i).collect(Collectors.toList());
        checkMaxSum(list);
    }

    public static void checkMaxSum(List<Integer> spins) {
        long sum = 0;
        int prevMax = Integer.MAX_VALUE;

        // Traverse from right to left
        for (int i = spins.size() - 1; i >= 0; i--) {
            int current = spins.get(i);

            // Choose the maximum valid value
            int chosen = Math.min(current, prevMax - 1);

            // Stop if value becomes negative
            if (chosen < 0) {
                break;
            }

            sum += chosen;
            prevMax = chosen;
        }

        System.out.println(sum);
    }
}
