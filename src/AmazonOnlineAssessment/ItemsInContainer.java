package AmazonOnlineAssessment;

import java.util.*;

public class ItemsInContainer {
    public static void main(String[] args) {
        String input = "*|**|*|";
        List<Integer> startIndices = new ArrayList<>();
        startIndices = Arrays.asList(1, 1, 1);
        List<Integer> endIndices = new ArrayList<>();
        endIndices = Arrays.asList(5, 6, 7);
        System.out.println(numberOfItems(input, startIndices, endIndices));

        String input2 = "*|*|*|";
        List<Integer> startIndices2 = new ArrayList<>();
        startIndices2 = Arrays.asList(1);
        List<Integer> endIndices2 = new ArrayList<>();
        endIndices2 = Arrays.asList(6);
        System.out.println(numberOfItems(input2, startIndices2, endIndices2));

        String input3 = "|**|*|*";
        List<Integer> startIndices3 = new ArrayList<>();
        startIndices3 = Arrays.asList(1, 1, 1);
        List<Integer> endIndices3 = new ArrayList<>();
        endIndices3 = Arrays.asList(5, 6, 7);
        System.out.println(numberOfItems(input3, startIndices3, endIndices3));
    }

    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        List<Integer> result = new ArrayList<>();
        TreeMap<Integer, Integer> hmap = new TreeMap<>();
        int count = 0;
        char[] schar = s.toCharArray();
        for (int i = 1; i <= schar.length; i++) {
            if (schar[i-1] == '*') {
                count++;
            } else {
                hmap.put(i, count);
            }
        }
//        System.out.println(hmap);
        for (int i = 0; i < startIndices.size(); i++) {
            int startIndex = startIndices.get(i);
            int endIndex = endIndices.get(i);
            Integer startStar = hmap.ceilingEntry(startIndex).getValue();
            Integer endStar = hmap.floorEntry(endIndex).getValue();
            if (startStar == null || endStar == null) {
                result.add(0);
            } else {
                result.add(endStar - startStar);
            }
        }

        return result;
    }
}
