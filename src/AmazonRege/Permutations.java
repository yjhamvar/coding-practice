package AmazonRege;

public class Permutations {

    public static void main(String[] args){
        permuteSrishti(1,1);
//        permuteYasho(4,4);
    }

    public static void permuteSrishti(int x, int y){
        System.out.println(x+", "+y);
        if(y+1<=4){
            permuteSrishti(x, y+1);
        }
        if(x+1<=4){
            permuteSrishti(x+1, y);
        }
    }

    public static void permuteYasho(int x, int y){
        for(int i=0; i>=0; i++){
            for(int j=0; j>=0; j++){
                System.out.println(i+", "+j);
            }
        }
    }
}
