package src;

import java.util.*;
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int total=0;
        for(int i=0;i<s.length()-1;i++){
            if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1))){       // if i+1 > i then total+= -i;
                total += -hm.get(s.charAt(i));
            }
            else{
                total += hm.get(s.charAt(i));                      // else total+ i;
            }
        }
        System.out.print(total + hm.get(s.charAt(s.length()-1))); // adding last element to total

    }
}
