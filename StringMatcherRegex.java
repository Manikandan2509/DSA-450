package src;

public class StringMatcherRegex {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "lll";
        System.out.println(isPresent(s1,s2));
        System.out.println(returnIndex(s1,s2));
    }
    public static int returnIndex(String s1,String s2){
        return s1.indexOf(s2);
    }
    public static boolean isPresent(String s1,String s2){
        return s1.matches("(.*)"+s2+"(.*)");
    }
}
