package AmazonOnlineAssessment;

import java.util.TreeMap;

public class Turnstile {

    public static void main(String[] args) {
        int numCustomers = 4;
        int[] arrTime = {0, 0, 1, 5};
        int[] direction = {0, 1, 1, 0};
        System.out.println(solution(numCustomers, arrTime, direction));
    }

    public static int[] solution(int numCustomers, int[] arrTime, int[] direction) {
//        int[] result = new int[arrTime.length];
        TreeMap<Integer, Integer> result = new TreeMap<>();
        int lastOperation = 1;
        for (int i = 0, time=0; i < arrTime.length; time++) {
            if (result.containsKey(i)) {
                i++;
                continue;
            }
            int j = i;
            while (j < arrTime.length && j >= i && arrTime[j] <= time && direction[j] != lastOperation) {
                if (result.containsKey(j + 1)) {
                    break;
                }
                j++;
            }
            if (direction[i] == lastOperation) {
                result.put(i, time);
                i++;
            } else if (direction[i] != lastOperation && direction[j] == lastOperation) {
                result.put(j, time);
            } else if (direction[i] != lastOperation && direction[j] != lastOperation) {
                result.put(i, time);
                lastOperation = direction[i];
                i++;
            }
//            System.out.println(i + " "+ j);
        }
        System.out.println(result);
        return new int[]{0};
    }
}
