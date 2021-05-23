package AmazonRege;


import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Rege1 {
    public static void main(String[] args) {
        Rege1 rege = new Rege1();
        int result = rege.totalScore(8, Arrays.asList("5", "1.1", "-2", "4", "Z", "X", "9", "+", "+"));
        System.out.println("Result is: " + result);
    }

    public int totalScore(int num, List<String> blocks) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        for (String str : blocks) {
            switch (str) {
                case "Z":
                    if (stack.size() > 0) {
                        int z = stack.pop();
                        total -= z;
//                    System.out.println("Z:"+total);
                    }
                    break;
                case "X":
                    if (stack.size() > 0) {
                        int x = stack.peek();
                        total += (x * 2);
                        stack.push(x * 2);
                    }
//                    System.out.println("X:"+total);
                    break;
                case "+":
                    if (stack.size() > 1) {
                        int a = stack.pop();
                        int b = stack.pop();
//                    System.out.println("+ ka A:"+a);
//                    System.out.println("+ ka B:"+b);
                        total += a + b;
                        stack.push(b);
                        stack.push(a);
                        stack.push(a + b);
//                    System.out.println("+:"+total);
                    }
                    break;
                default:
                    try {
                        stack.push(Integer.parseInt(str));
                        total += Integer.parseInt(str);
//                    System.out.println("Total:"+total);
                    } catch (Exception e) {
                        continue;
                    }
                    break;
            }
        }
        return total;
    }

}
