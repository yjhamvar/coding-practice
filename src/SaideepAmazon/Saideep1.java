package SaideepAmazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Saideep1 {
    public static void main(String[] args) {
        Saideep1 rege = new Saideep1();
        String[] set = {"betacellular", "anacell", "cetracular", "deltacellular", "eurocell"};
        String[] sentences = {"I love anacell best services provided by anacell in the town",
                "betacellular has great service", "deltacellular betacellular",
                "cetracular eurocell", "betacellular deltacellular"};
        List<String> result = rege.popularNfeatures(5, 2, Arrays.asList(set), 5, Arrays.asList(sentences));
        System.out.println("Result is: " + result);
    }

    public ArrayList<String> popularNfeatures(int numFeatures, int topFeatures, List<String> possibleFeatures, int numFeatureRequests, List<String> featureRequests) {
        List<String> result = new ArrayList<>();
        Set<String> dictSet = new HashSet<>();
        for (String s : possibleFeatures) {
            dictSet.add(s.toLowerCase());
        }
        Map<String, Integer> frequency = new HashMap<>();
        for (String sentence : featureRequests) {
            String[] words = sentence.toLowerCase().split("\\s+");
            Set<String> seen = new HashSet<>();
            for (String word : words) {
                if (dictSet.contains(word) && !seen.contains(word)) {
                    frequency.put(word, frequency.getOrDefault(word, 0) + 1);
                    seen.add(word);
                }
            }
        }

        ArrayList<String> ls = new ArrayList<>(frequency.keySet());
        Collections.sort(ls,
                (a, b) -> (frequency.get(a)).equals(frequency.get(b)) ? a.compareTo(b) : frequency.get(b) - frequency.get(a));
        if (topFeatures > numFeatures && topFeatures > ls.size()) {
            return ls;
        }
        return new ArrayList<>(ls.subList(0, topFeatures));
    }
}
