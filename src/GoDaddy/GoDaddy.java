package GoDaddy;

import java.util.Arrays;
import java.util.List;

public class GoDaddy {
    public static void main(String[] args) {
        GoDaddy g = new GoDaddy();
        System.out.println(g.rollTheString("vwxyz", Arrays.asList(1,2,3,4,5)));
    }

    String rollTheString(String s, List<Integer> roll){
        char[] inp = s.toCharArray();
        int operations = roll.size();
        System.out.println("Operations:"+operations);
        if(operations>0){
            for(int i=0; i<operations; i++){
                int nextOp = roll.get(i);
                for(int j=0;j<nextOp;j++){
                    int ascii = inp[j];
                    ascii=((ascii+1-97)%26)+97;
                    inp[j] = (char)ascii;
                }
            }
        }
        return(new String(inp));
    }

}
