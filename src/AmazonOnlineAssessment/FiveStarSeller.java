package AmazonOnlineAssessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class FiveStarSeller {
    public static void main(String[] args) {
        int ratingsThreshold = 77;
        List<List<Integer>> input = new ArrayList<>();
        List<Integer> one = new ArrayList<>(Arrays.asList(4, 4));
        List<Integer> two = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> three = new ArrayList<>(Arrays.asList(3, 6));
        input.add(one);
        input.add(two);
        input.add(three);
        Assert.assertEquals(3, fiveStarReviews(input, ratingsThreshold));

        int ratingsThreshold2 = 77;
        List<List<Integer>> input2 = new ArrayList<>();
        List<Integer> one2 = new ArrayList<>(Arrays.asList(3, 6));
        List<Integer> two2 = new ArrayList<>(Arrays.asList(7, 7));
        List<Integer> three2 = new ArrayList<>(Arrays.asList(2, 7));
        List<Integer> four2 = new ArrayList<>(Arrays.asList(3, 3));
        input2.add(one2);
        input2.add(two2);
        input2.add(three2);
        input2.add(four2);
        Assert.assertEquals(5, fiveStarReviews(input2, ratingsThreshold2));
    }

    public static int fiveStarReviews(List<List<Integer>> productRatings, int ratingsThreshold) {
        int count = 0;
        while (average(productRatings) < (double)ratingsThreshold) {
            int pos = mostIncrease(productRatings);
            productRatings.get(pos).set(0, productRatings.get(pos).get(0) + 1);
            productRatings.get(pos).set(1, productRatings.get(pos).get(1) + 1);
            count++;
        }
        return count;
    }

    private static double average(List<List<Integer>> productRatings) {
        double sum = 0;
        for (List<Integer> pair : productRatings) {
            sum += ((double)pair.get(0) / (double)pair.get(1));
        }
        return (sum / productRatings.size()) * 100;
    }

    private static int mostIncrease(List<List<Integer>> productRatings) {
        int pos = 0;
        double diff = 0;
        int i = 0;
        for (List<Integer> pair : productRatings) {
            if (pair.get(0) != pair.get(1)) {
                double localdiff = ((double)(pair.get(0) + 1) / (double)(pair.get(1) + 1)) - ((double)pair.get(0) / (double)pair.get(1));
                if (localdiff > diff) {
                    diff = localdiff;
                    pos = i;
                }
            }
            i++;
        }
//        System.out.println(pos);
        return pos;
    }
}
