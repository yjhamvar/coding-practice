package Gitang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        List<Integer> movieDuration = new ArrayList<>(Arrays.asList(100,180,40,120,10));
        int flightDuration = 250;
        System.out.println(foo(flightDuration, movieDuration));
    }

    public static List<Integer> foo(int flightDuration, List<Integer> movieDuration) {
        int targetDuration = flightDuration - 30;
        List<Integer> result = new ArrayList<>();
        Map<Integer, List<Integer>> movieMap = new HashMap<>();

        for (int i = 0; i < movieDuration.size(); i++) {
            if (movieMap.containsKey(movieDuration.get(i))) {
                List<Integer> durations = movieMap.get(movieDuration.get(i));
                durations.add(i);
                movieMap.put(movieDuration.get(i), durations);
            } else {
                List<Integer> durations = new ArrayList<>();
                durations.add(i);
                movieMap.put(movieDuration.get(i), durations);
            }
        }

//        Collections.sort(movieDuration, Collections.reverseOrder());

        for (int i : movieDuration) {
            int toSearch = targetDuration - i;
            // 25 = 60-35;
            if (movieMap.containsKey(toSearch)) {
                if (i == toSearch) {
                    if (movieMap.get(toSearch).size() > 1) {
                        List<Integer> durations = movieMap.get(toSearch);
                        result.add(durations.get(0));
                        result.add(durations.get(1));
                        break;
                    }
                } else {
                    List<Integer> duration1 = movieMap.get(i);
                    List<Integer> duration2 = movieMap.get(toSearch);
                    result.add(duration1.get(0));
                    result.add(duration2.get(0));
                    break;
                }
            }
        }
        if (result.size() > 0) {
            return result;
        } else {
            result.add(-1);
            result.add(-1);
            return result;
        }
    }
}
