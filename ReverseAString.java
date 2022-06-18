import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        char s[] = {'h','e','l','l','o'};
        int left=0;
        int right=s.length-1;  // reverse a String or Array using swap
        while(left<right){
            char temp = s[left]; // swapping left element to right element till left<right
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.print(Arrays.toString(s));
    }
}
