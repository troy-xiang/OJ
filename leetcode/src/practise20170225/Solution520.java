package practise20170225;

/**
 * Created by troy on 2017/2/25.
 * 520.Detect Capital
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 */
public class Solution520 {
    // 大写字母从65-90 小写字母从97到122
    public boolean detectCapitalUse(String word) {
        /*if(word.equals("") || word == null || word.length() < 2) {
            return true;
        }
        char x = word.charAt(0);
        boolean flag = true;
        if (Character.isLowerCase(x)) {
            for (int i = 1; i < word.length(); i++) {
                if(!Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
        } else {
            x = word.charAt(1);
            if(Character.isLowerCase(x)) {
                for (int i = 2; i < word.length(); i++) {
                    if(!Character.isLowerCase(word.charAt(i))) {
                        return false;
                    }
                }
            } else {
                for (int i = 2; i < word.length(); i++) {
                    if(Character.isLowerCase(word.charAt(i))) {
                        return false;
                    }
                }
            }
        }
        return true;*/

        // 最好的方法是使用正则表达式
        //return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
        /*return word.equals(word.toLowerCase()) || word.equals(word.toUpperCase()) ||
                Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()); */
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }
        if(count == 1) {
            return word.substring(1).equals(word.substring(1).toLowerCase());
        }
        return count == 0 || count == word.length();
    }
}
