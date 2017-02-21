package practise20170220;

import java.util.Arrays;

/**
 * Created by troy on 2017/2/20.
 * 455. Assign Cookies
 * Assume you are an awesome parent and want to give your children some cookies.
 * But, you should give each child at most one cookie. Each child i has a greed factor gi,
 * which is the minimum size of a cookie that the child will be content with;
 * and each cookie j has a size sj. If sj >= gi, we can assign the cookie j to the child i,
 * and the child i will be content.
 * Your goal is to maximize the number of your content children and output the maximum number.
 */
public class Solution455 {
    public int findContentChildren(int[]g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for(int i = 0; i < s.length && count < g.length; i++) {
            if(g[count] <= s[i]) {
                count++;
            }
        }
        return count;
    }
}
