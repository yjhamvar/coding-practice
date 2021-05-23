package AmazonOnlineAssessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilizationChecks {
    public static void main(String[] args) {
        int instances = 2;
        List<Integer> averageUtil = new ArrayList<>(Arrays.asList(25, 23, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 76, 80));
        System.out.println(finalInstances(instances, averageUtil));
    }

    public static int finalInstances(int instances, List<Integer> averageUtil) {
        final int LIMIT = 2 * 100000000;
        for (int i = 0; i < averageUtil.size(); ) {
            int numberToConsider = averageUtil.get(i);
            if (numberToConsider >= 25 && numberToConsider <= 60) {
                i++;
            } else if (numberToConsider > 60) {
                int temp = instances * 2;
                if (temp < LIMIT) {
                    instances = temp;
                    i = i + 11;
                }
            } else if (numberToConsider < 25) {
                if (instances > 1) {
                    instances = (int) Math.ceil(instances / 2);
                    i = i + 11;
                }
            }
        }
        return instances;
    }
}
