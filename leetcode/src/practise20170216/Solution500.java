package practise20170216;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author troy
 * Keyboard Row
 * Given a List of words, return the words that can be typed using letters 
 * of alphabet on only one row's of American keyboard like the image below.
 */
public class Solution500 {
	public String[] findWords(String[] words) {
		if(words.length == 0) {
			return words;
		}
		List<String> results = new ArrayList<String>();
		String[] match = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
		for(int i = 0; i < words.length; i++) {
			boolean flag = true;
			String str = words[i].toLowerCase();
			if(str.length() == 0) {
				break;
			}
			int index = 0;
			for(int j = 0; j < match.length; j++) {
				if(match[j].indexOf(str.charAt(0)) != -1) {
					index = j;
				}
			}
			for(int j = 1; j < str.length(); j++) {
				if(match[index].indexOf(str.charAt(j)) == -1) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				results.add(words[i]);
			}
		}
		if(results.size() > 0) {
			String[] res = new String[results.size()];
			for(int i = 0; i < results.size(); i++) {
				res[i] = results.get(i);
			}
			return res;
		}
		return new String[]{};
	}
}
