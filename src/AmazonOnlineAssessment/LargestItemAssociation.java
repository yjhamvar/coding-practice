package AmazonOnlineAssessment;

import java.util.*;

public class LargestItemAssociation {

    public static void main(String[] args) {
        List<PairString> input = new ArrayList<>();
        input.add(new PairString("c", "d"));
        input.add(new PairString("d", "e"));
        input.add(new PairString("a", "b"));
        input.add(new PairString("b", "g"));
        System.out.println(largestItemAssociation(input));

        List<PairString> itemAssociation1 = new ArrayList() {
            {
                add(new PairString("item1", "item2"));
                add(new PairString("item3", "item4"));
                add(new PairString("item4", "item5"));
            }
        };
        List<PairString> itemAssociation2 = new ArrayList() {
            {
                add(new PairString("item1", "item2"));
                add(new PairString("item3", "item4"));
                add(new PairString("item4", "item5"));
                add(new PairString("item6", "item7"));
                add(new PairString("item6", "item8"));
            }
        };
        List<PairString> itemAssociation3 = new ArrayList() {
            {
                add(new PairString("item1", "item2"));
                add(new PairString("item4", "item5"));
                add(new PairString("item3", "item4"));
                add(new PairString("item1", "item4"));
            }
        };
        System.out.println(largestItemAssociation(itemAssociation1)); // Output: [item3, item4, item5]
        System.out.println(largestItemAssociation(itemAssociation2)); // Output: [item3, item4, item5], here we got same size, so have to sort lexicographical.
        System.out.println(largestItemAssociation(itemAssociation3)); // Output: [item1, item2, item3, item4, item5]
    }

    public static List<String> largestItemAssociation(List<PairString> itemAssociation) {
        List<String> result = new ArrayList<>();
        HashMap<String, List<String>> graph = new HashMap<>();
        Set<String> visited = new HashSet<>();
        TreeMap<Integer, List<Set>> tmap = new TreeMap<>(Collections.reverseOrder());
        //Building the graph
        for (PairString p : itemAssociation) {
            if (graph.containsKey(p.first)) {
                graph.get(p.first).add(p.second);
            } else {
                graph.put(p.first, new ArrayList<>(Arrays.asList(p.second)));
            }

            if (graph.containsKey(p.second)) {
                graph.get(p.second).add(p.first);
            } else {
                graph.put(p.second, new ArrayList<>(Arrays.asList(p.first)));
            }
        }
//        System.out.println(graph);

        //Visiting each node of the graph to find out largest set of connected vertices
        for (String key : graph.keySet()) {
            if (!visited.contains(key)) {
//                System.out.println(key);
                Set<String> currentSet = dfs(visited, key, graph, new TreeSet<String>());
//                System.out.println(currentSet);
                if (tmap.containsKey(currentSet.size())) {
                    List<Set> list = tmap.get(currentSet.size());
                    list.add(currentSet);
                    tmap.put(currentSet.size(), list);
                } else {
                    List<Set> list = new ArrayList<>();
                    list.add(currentSet);
                    tmap.put(currentSet.size(), list);
                }
            }
        }

        //Now we have the connected sets in the treemap.
        List<Set> listOfLargestSets = tmap.firstEntry().getValue();
//        System.out.println("Before Sorting:"+listOfLargestSets);
        Collections.sort(listOfLargestSets, new Comparator<Set>() {
            @Override
            public int compare(Set o1, Set o2) {
                Iterator<String> i1 = o1.iterator();
                Iterator<String> i2 = o2.iterator();
                while(i1.hasNext() && i2.hasNext()){
                    String a = i1.next();
                    String b = i2.next();
                    if(a.equals(b)){
                        continue;
                    }
                    return a.compareTo(b);
                }
                return 0;
            }
        });
//        System.out.println("After Sorting:"+listOfLargestSets);
        return new ArrayList<String>(listOfLargestSets.get(0));
    }

    public static Set<String> dfs(Set<String> visited, String node, HashMap<String, List<String>> graph, Set<String> currentSet) {
        if (visited.contains(node)) {
            return currentSet;
        } else {
            visited.add(node);
            if (!currentSet.contains(node)) {
                currentSet.add(node);
                for (String n : graph.get(node)) {
                    dfs(visited, n, graph, currentSet);
                }
            }
        }
        return currentSet;
    }
}

class PairString {
    String first;
    String second;

    public PairString(String first, String second) {
        this.first = first;
        this.second = second;
    }
}
