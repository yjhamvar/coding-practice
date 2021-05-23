package Cisco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cisco {

    public static void main(String[] args) {
        long target =12;
        int count=0;
        int targetInt = (int)target;
        List<Integer> stocksProfit = Arrays.asList(7,6,12,3,3,9,5,1);
        HashSet<Integer> hset = new HashSet<>();
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i: stocksProfit){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }

        for(int i: stocksProfit){
            int j = targetInt - i;
            if(freq.get(j)!=null){
                if(!hset.contains(i) && !hset.contains(j)){
                    count++;
                    System.out.println(i+","+j);
                    hset.add(i);
                    hset.add(j);
                }
            }
//                if(i==j){
//                    if(freq.get(j)!=null && freq.get(j)>1){
//                        count++;
//                        System.out.println(i+","+j);
//                        freq.put(i, (freq.get(i)-1));
//                        freq.put(j, (freq.get(j)-1));
//                    }
//                }
//                else {
//                    if (freq.get(i) > 0 && freq.get(j) != null && freq.get(j) > 0) {
//                        count++;
//                        System.out.println(i + "," + j);
//                        freq.put(i, (freq.get(i) - 1));
//                        freq.put(j, (freq.get(j) - 1));
//                    }
//                }
        }
        System.out.println(count);


/*	// write your code here
         Pattern pattern;
         Matcher matcher;
        String EMAIL_PATTERN = "[a-z]{1,6}(_)?\\d{0,4}@hackerrank.com";
        pattern = Pattern.compile(EMAIL_PATTERN);

        matcher = pattern.matcher("yasho_1234@hackerrank.com");
        System.out.println(matcher.matches());*/


    }
}


