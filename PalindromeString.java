public class PalindromeString {
    public static void main(String[] args) {
        String S = "abba";
        String temp ="";
        for(int i=S.length()-1;i>=0;i--){
            temp = temp+S.charAt(i);
        }
        System.out.println(temp);
        System.out.println(S);

        if(S.equals(temp)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
