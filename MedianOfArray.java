package src;
import java.util.*;
public class MedianOfArray {
    public static void main(String[] args) {
        int v[] = {20,45,33,12,14,22};
        System.out.print(median(v));

    }
    public static int median(int[] v){
        Arrays.sort(v);
        if(v.length%2 == 0){
            return (v[v.length/2] + v[(v.length/2)-1])/2;
        }
        else{
            return v[v.length/2];
        }
    }
}
