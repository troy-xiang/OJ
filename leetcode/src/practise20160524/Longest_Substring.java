package practise20160524;

import java.util.Scanner;

/**
 * Created by Troy on 2016/5/24.
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class Longest_Substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        //System.out.println(str);
        //这里只能用i<str.length()做判断条件，不能使用str.charAt(i)!='\0'
        // 因为java里字符串有长度字段，所以末尾不用'\0'结尾
        /*for(int i=0;i<str.length();i++) {
            System.out.println(str.charAt(i));
        }*/
        //System.out.println((int) str.charAt(7));
        Solution3 solution3 = new Solution3();
        int longestLength = solution3.lengthOfLongestSubstring(str);
        System.out.println(longestLength);
    }
}

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1)
            return s.length();
        int prev = 0;
        boolean[] letter = new boolean[256];    //ASCII码 0-255 一共256个
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!letter[s.charAt(i)])
                letter[s.charAt(i)] = true;
            else {
                //一直找到跟当前元素相等的那个字符
                // 然后从它后面的一个字符开始继续算新的长度
                while (s.charAt(prev) != s.charAt(i)) {
                    letter[s.charAt(prev)] = false;
                    prev++;
                }
                prev++;
            }
            max = Math.max(max, i - prev + 1);
        }
        return max;
    }

    public int lengthOfLongestSubstring1(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        boolean[] letter = new boolean[256];
        int prev = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (letter[s.charAt(i)] == false) {
                letter[s.charAt(i)] = true;
            } else {
                while (s.charAt(prev) != s.charAt(i)) {
                    letter[s.charAt(i)] = false;
                    prev++;
                }
                prev++;
            }
            max = Math.max(max, i - prev + 1);
        }
        return max;
    }
}
