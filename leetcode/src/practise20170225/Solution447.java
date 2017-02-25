package practise20170225;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by troy on 2017/2/25.
 * 447. Number of Boomerangs
 * Given n points in the plane that are all pairwise distinct,
 * a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j
 * equals the distance between i and k (the order of the tuple matters).
 * Find the number of boomerangs. You may assume that n will be at most 500
 * and coordinates of points are all in the range [-10000, 10000] (inclusive).
 */
public class Solution447 {
    public int numberOfBoomerangs(int[][] points) {
        // 选择一个元组作为第一个元组，依次计算出其与其它元祖之间的距离，
        // 若存在多于一个以上的距离相等，则从距离相等元组中有顺序的选择两个放在第二个和第三个，即C(n,2)
        if(points.length < 3) {
            return 0;
        }
        int res = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for(int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                int key = getDistance(points[i], points[j]);
                count.put(key, count.getOrDefault(key, 0) + 1);
                /*if(count.containsKey(key)) {
                    count.put(key, count.get(key) + 1);
                } else {
                    count.put(key, 1);
                }*/
            }
            for (int key : count.keySet()) {
                int size = count.get(key);
                if(size > 1) {
                    res += (size * (size - 1));
                }
            }
            count.clear();
        }
        return res;
    }

    private int getDistance(int[] point1, int[] point2) {
        return (int) (Math.pow((point1[0] - point2[0]), 2) + Math.pow((point1[1] - point2[1]), 2));
    }
}
