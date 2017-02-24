package practise20170223;

import java.util.*;

/**
 * Created by troy on 2017/2/23.
 * 409.Longest Palindrome
 * Given a string which consists of lowercase or uppercase letters,
 * find the length of the longest palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 */
public class Solution409 {
    public int longestPalindrome(String s) {
        /*if(s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> ref = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if(ref.containsKey(x)) {
                ref.put(x, ref.get(x) + 1);
            } else {
                ref.put(x, 1);
            }
        }
        int result = 0;
        boolean flag = true;
        Iterator iterator = ref.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Character, Integer> integerEntry = (Map.Entry<Character, Integer>) iterator.next();
            int val = integerEntry.getValue();
            if(val % 2 == 0) {
                result += val;
            } else {
                flag = false;
                if(val > 1) {
                    result = result + val - 1;
                }
            }
        }
        if(flag == false) {
            result++;
        }
        return result;*/
        if(s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if(set.contains(x)) {
                set.remove(x);
                res++;
            } else {
                set.add(x);
            }
        }
        if(set.isEmpty() == true) {
            return res * 2;
        }
        return res * 2 + 1;
    }
}
