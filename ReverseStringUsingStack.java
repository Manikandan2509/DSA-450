import java.util.Arrays;
import java.util.Stack;
public class ReverseStringUsingStack {
    public static void main(String[] args) {
        char[] s ={'h','e','l','l','o'};
        System.out.println("before"+ Arrays.toString(s));

        reverse(s);
        System.out.println(Arrays.toString(s));
    }
    static char[] reverse(char[] s){
        Stack stack = new Stack();
        for(int i=0;i<s.length;i++){
            stack.push(s[i]);
        }
        for (int i = 0; i < s.length; i++) {
            s[i]= (char) stack.pop();
        }
        return s;
    }
}
