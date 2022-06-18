import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,0,9};
        reverse(array);
        System.out.print(Arrays.toString(array));
    }
    static void reverse(int[] array){
        int left=0;
        int right = array.length-1;
        while(left<right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
