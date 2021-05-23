package AmazonOnlineAssessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;


/*
 * https://leetcode.com/discuss/interview-question/762546/
 */

public class AmazonFresh {
    public static void main(String[] args) {
        List<String> shoppingCart;
        List<List<String>> codesList = new ArrayList<>();
        codesList.add(Arrays.asList("apple", "apple"));
        codesList.add(Arrays.asList("banana", "apple", "banana"));
        shoppingCart = (Arrays.asList("apple", "apple", "apple", "banana"));
        Assert.assertEquals(0, solution(codesList, shoppingCart));


        List<String> shoppingCart2;
        List<List<String>> codesList2 = new ArrayList<>();
        codesList2.add(Arrays.asList("apple", "apple"));
        codesList2.add(Arrays.asList("banana", "anything", "banana"));
        shoppingCart2 = (Arrays.asList("banana", "orange", "banana", "apple", "apple"));
        Assert.assertEquals(0, solution(codesList2, shoppingCart2));

        List<String> shoppingCart3;
        List<List<String>> codesList3 = new ArrayList<>();
        codesList3.add(Arrays.asList("apple", "apple"));
        codesList3.add(Arrays.asList("banana", "anything", "banana"));
        shoppingCart3 = (Arrays.asList("apple", "banana", "apple", "banana", "orange", "banana"));
        Assert.assertEquals(0, solution(codesList3, shoppingCart3));

        List<String> shoppingCart4;
        List<List<String>> codesList4 = new ArrayList<>();
        codesList4.add(Arrays.asList("apple", "apple"));
        codesList4.add(Arrays.asList("apple", "apple", "banana"));
        shoppingCart4 = (Arrays.asList("apple", "apple", "apple", "banana"));
        Assert.assertEquals(0, solution(codesList4, shoppingCart4));

        List<String> shoppingCart1;
        List<List<String>> codesList1 = new ArrayList<>();
        codesList1.add(Arrays.asList("apple", "apple"));
        codesList1.add(Arrays.asList("banana", "anything", "banana"));
        shoppingCart1 = (Arrays.asList("orange", "apple", "apple", "banana", "orange", "banana"));
        Assert.assertEquals(1, solution(codesList1, shoppingCart1));

        List<String> shoppingCart5;
        List<List<String>> codesList5 = new ArrayList<>();
        codesList5.add(Arrays.asList("apple", "apple"));
        codesList5.add(Arrays.asList("banana", "anything", "banana"));
        shoppingCart5 = (Arrays.asList("orange", "apple", "apple", "banana", "orange", "banana"));
        Assert.assertEquals(1, solution(codesList5, shoppingCart5));

        List<String> shoppingCart6;
        List<List<String>> codesList6 = new ArrayList<>();
        codesList6.add(Arrays.asList("apple", "apple"));
        codesList6.add(Arrays.asList("banana", "anything", "banana"));
        shoppingCart6 = (Arrays.asList("apple", "apple", "orange", "orange", "banana", "apple", "banana", "banana"));
        Assert.assertEquals(1, solution(codesList6, shoppingCart6));

        List<String> shoppingCart7;
        List<List<String>> codesList7 = new ArrayList<>();
        codesList7.add(Arrays.asList("anything", "apple"));
        codesList7.add(Arrays.asList("banana", "anything", "banana"));
        shoppingCart7 = (Arrays.asList("orange", "grapes", "apple", "orange", "orange", "banana", "apple", "banana", "banana"));
        Assert.assertEquals(1, solution(codesList7, shoppingCart7));

        List<String> shoppingCart8;
        List<List<String>> codesList8 = new ArrayList<>();
        codesList8.add(Arrays.asList("apple", "orange"));
        codesList8.add(Arrays.asList("orange", "banana", "orange"));
        shoppingCart8 = (Arrays.asList("apple", "orange", "banana", "orange", "orange", "banana", "orange", "grape"));
        Assert.assertEquals(1, solution(codesList8, shoppingCart8));

        List<String> shoppingCart9;
        List<List<String>> codesList9 = new ArrayList<>();
        codesList9.add(Arrays.asList("anything", "anything", "anything", "apple"));
        codesList9.add(Arrays.asList("banana", "anything", "banana"));
        shoppingCart9 = Arrays.asList("orange", "apple", "banana", "orange", "apple", "orange", "orange", "banana", "apple", "banana");
        Assert.assertEquals(1, solution(codesList9, shoppingCart9));

        List<String> shoppingCart10;
        List<List<String>> codesList10 = new ArrayList<>();
        codesList10.add(Arrays.asList("anything", "anything", "anything"));
        codesList10.add(Arrays.asList("anything"));
        shoppingCart10 = Arrays.asList("orange", "apple", "banana", "orange", "apple", "orange", "orange", "banana", "apple", "banana");
        Assert.assertEquals(1, solution(codesList10, shoppingCart10));

        List<String> shoppingCart11;
        List<List<String>> codesList11 = new ArrayList<>();
        codesList11.add(Arrays.asList("anything", "anything", "orange"));
        codesList11.add(Arrays.asList("anything"));
        shoppingCart11 = Arrays.asList("orange", "apple", "banana", "apple", "apple", "apple", "apple", "apple", "apple", "orange");
        Assert.assertEquals(0, solution(codesList11, shoppingCart11));

        List<String> shoppingCart12;
        List<List<String>> codesList12 = new ArrayList<>();
        codesList12.add(Arrays.asList("anything", "anything", "orange"));
        codesList12.add(Arrays.asList("anything"));
        shoppingCart12 = Arrays.asList("orange", "apple", "banana", "apple", "apple", "apple", "apple", "apple", "apple", "orange", "apple");
        Assert.assertEquals(1, solution(codesList12, shoppingCart12));

        List<String> shoppingCart13;
        List<List<String>> codesList13 = new ArrayList<>();
        codesList13.add(Arrays.asList("orange", "orange"));
        codesList13.add(Arrays.asList("apple", "apple", "apple", "banana"));
        shoppingCart13 = Arrays.asList("orange", "orange", "banana", "apple", "apple", "apple", "apple", "banana");
        Assert.assertEquals(1, solution(codesList13, shoppingCart13));

        List<String> shoppingCart14;
        List<List<String>> codesList14 = new ArrayList<>();
        codesList14.add(Arrays.asList("apple", "orange", "banana", "apple", "orange", "pine"));
        shoppingCart14 = Arrays.asList("apple", "orange", "banana", "apple", "orange", "banana", "apple", "orange", "pine");
        Assert.assertEquals(1, solution(codesList14, shoppingCart14));

        List<String> shoppingCart15;
        List<List<String>> codesList15 = new ArrayList<>();
        codesList15.add(Arrays.asList("apple", "orange", "banana", "apple", "orange", "pine"));
        shoppingCart15 = Arrays.asList("apple", "orange", "banana", "apple", "orange", "apple", "orange", "banana", "apple", "orange", "pine");
        Assert.assertEquals(1, solution(codesList15, shoppingCart15));

        List<String> shoppingCart16;
        List<List<String>> codesList16 = new ArrayList<>();
        codesList16.add(Arrays.asList("apple", "orange", "anything", "anything", "anything", "apple", "orange"));
        shoppingCart16 = Arrays.asList("apple", "orange", "banana", "banana", "banana", "banana", "apple", "orange");
        Assert.assertEquals(0, solution(codesList16, shoppingCart16));

        List<String> shoppingCart17;
        List<List<String>> codesList17 = new ArrayList<>();
        codesList17.add(Arrays.asList("apple", "orange", "banana", "apple", "orange", "pine"));
        codesList17.add(Arrays.asList("apple", "orange", "banana", "apple", "orange", "pine"));
        shoppingCart17 = Arrays.asList("apple", "orange", "banana", "apple", "orange", "apple", "orange", "banana", "apple", "orange", "pine");
        Assert.assertEquals(0, solution(codesList17, shoppingCart17));

        List<String> shoppingCart18;
        List<List<String>> codesList18 = new ArrayList<>();
        codesList18.add(Arrays.asList("apple", "orange", "banana", "apple", "orange", "pine"));
        codesList18.add(Arrays.asList("anything"));
        shoppingCart18 = Arrays.asList("apple", "orange", "banana", "apple", "orange", "apple", "orange", "banana", "apple", "orange", "pine");
        Assert.assertEquals(0, solution(codesList18, shoppingCart18));

        List<String> shoppingCart19;
        List<List<String>> codesList19 = new ArrayList<>();
        codesList19.add(Arrays.asList("apple", "orange", "banana", "apple", "orange", "pine"));
        codesList19.add(Arrays.asList("anything"));
        shoppingCart19 = Arrays.asList("apple", "orange", "banana", "apple", "orange", "apple", "orange", "banana", "apple", "orange", "pine", "banana");
        Assert.assertEquals(1, solution(codesList19, shoppingCart19));

        List<String> shoppingCart20;
        List<List<String>> codesList20 = new ArrayList<>();
        codesList20.add(Arrays.asList("apple", "orange", "banana", "apple", "orange", "pine"));
        codesList20.add(Arrays.asList("apple", "orange", "banana", "apple", "orange", "pine"));
        shoppingCart20 = Arrays.asList("apple", "orange", "banana", "apple", "orange", "apple", "orange", "banana", "apple", "orange", "pine", "apple", "orange", "banana", "apple", "orange", "cherry");
        Assert.assertEquals(0, solution(codesList20, shoppingCart20));

        List<String> shoppingCart21;
        List<List<String>> codesList21 = new ArrayList<>();
        codesList21.add(Arrays.asList("apple", "orange", "banana"));
        shoppingCart21 = Arrays.asList("apple", "orange", "apple", "apple", "orange", "banana");
        Assert.assertEquals(1, solution(codesList21, shoppingCart21));

        List<String> shoppingCart22;
        List<List<String>> codesList22 = new ArrayList<>();
        codesList22.add(Arrays.asList("apple", "orange", "banana"));
        shoppingCart22 = Arrays.asList("apple", "apple", "orange", "banana");
        Assert.assertEquals(1, solution(codesList22, shoppingCart22));
    }

    public static int solution(List<List<String>> codesList, List<String> shoppingCart) {
        int result = 0;
        int codesListLenth = codesList.size() - 1;
        int lastCodeLength = codesList.get(codesListLenth).size() - 1;
        int i = 0;
        int j = 0;
        for (int x = 0; x < shoppingCart.size(); x++) {
            if (codesList.get(i).get(j).equals("anything") || shoppingCart.get(x).equals(codesList.get(i).get(j))) {
                result = 1;
                if (j < codesList.get(i).size() - 1) {
                    j++;
                } else {
                    if (i < codesList.size() - 1) {
                        i++;
                        j = 0;
                    } else {
                        return 1;
                    }
                }
            }
//            else if(shoppingCart.get(x).equals(codesList.get(i).get(0 + getPreceedingAnythings(codesList.get(i))))){
//                result = 1;
//                j = 0 + getPreceedingAnythings(codesList.get(i)) + 1;
//            }
            else {
                result = 0;
                x = x - j;
                j = 0;
            }
        }
        if (i <= codesListLenth || j <= lastCodeLength) {
            return 0;
        }
        return result;
    }

//    private static int getPreceedingAnythings(List<String> strings) {
//        int count=0;
//        for(String s:strings){
//            if(!s.equals("anything")){
//                break;
//            }else{
//                count++;
//            }
//        }
//        return count;
//    }
}
