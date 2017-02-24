package practise20170223;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troy on 2017/2/23.
 * 401. Binary Watch
 * A binary watch has 4 LEDs on the top which represent the hours (0-11),
 * and the 6 LEDs on the bottom represent the minutes (0-59).
 * Each LED represents a zero or one, with the least significant bit on the right.
 * Given a non-negative integer n which represents the number of LEDs that are currently on,
 * return all possible times the watch could represent.
 */
public class Solution401 {
    public List<String> readBinaryWatch(int num) {
        /*List<String> res = new ArrayList<>();
        if(num > 8) {
            return res;
        }
        // 表示小时的led最多亮3个，表示分钟的led最多亮5个
        // 用两个二维数组分别表示时钟和分钟
        String[][] hour = new String[4][];
        hour[0] = new String[] {"0"};
        hour[1] = new String[] {"1", "2", "4", "8"};
        hour[2] = new String[] {"3", "5", "6", "9", "10"};
        hour[3] = new String[] {"7", "11"};

        String[][] minute = new String[6][];
        minute[0] = new String[] {"00"};
        minute[1] = new String[] {"01", "02", "04", "08", "16", "32"};
        minute[2] = new String[] {"03", "05", "06", "09", "10", "12", "17", "18", "20", "24", "33", "34", "36", "40", "48"};
        minute[3] = new String[] {"07", "11", "13", "14", "19", "21", "22", "25", "26", "28", "35", "37", "38", "41", "42", "44", "49", "50", "52", "56"};
        minute[4] = new String[] {"15", "23", "27", "29", "30", "39", "43", "45", "46", "51", "53", "54", "57", "58"};
        minute[5] = new String[] {"31", "47", "55", "59"};
        for(int i = 0; i <= num; i++) {
            if(i > 3) {
                break;
            }
            if((num - i) > 5) {
                continue;
            }
           for (int m = 0; m < hour[i].length; m++) {
               for (int n = 0; n < minute[num - i].length; n++) {
                   StringBuilder sb = new StringBuilder();
                   sb.append(hour[i][m] + ":" + minute[num - i][n]);
                   res.add(sb.toString());
               }
           }
        }
        return res;*/
        if (num > 8) {
            return new ArrayList<>();
        }
        ArrayList<String> res = new ArrayList<>();
        int[] hour = {1, 2, 4, 8};
        int[] minute = {1, 2, 4, 8, 16, 32};
        for(int i = 0; i <= num; i++) {
            ArrayList<Integer> hourList = generateSum(hour, i);
            ArrayList<Integer> minuteList = generateSum(minute, num - i);
            for (int h : hourList) {
                if(h < 12) {
                    for (int min : minuteList) {
                        if(min < 60) {
                            res.add(h + ":" + (min < 10 ? "0" + min : min));
                        }
                    }
                }
            }
        }
        return res;
    }

    private ArrayList<Integer> generateSum(int[] num, int count) {
        ArrayList<Integer> res = new ArrayList<>();
        generateSumAction(num, count, 0, 0, res);
        return res;
    }

    private void generateSumAction(int[] num, int count, int pos, int sum, ArrayList<Integer> res) {
        if(count == 0) {
            res.add(sum);
        }
        for(int i = pos; i < num.length; i++) {
            generateSumAction(num, count - 1, i + 1, sum + num[i], res);
        }
    }
}
