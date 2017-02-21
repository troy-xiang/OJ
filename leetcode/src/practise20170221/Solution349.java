package practise20170221;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troy on 2017/2/21.
 * 349. Intersection of Two Arrays
 * Given two arrays, write a function to compute their intersection.
 */
public class Solution349 {
    public int[] interSection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) {
            return new int[] {};
        }
        List<Integer> num1ToArray = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++) {
            num1ToArray.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++) {
            if(num1ToArray.contains(nums2[i])) {
                if(!res.contains(nums2[i])) {
                    res.add(nums2[i]);
                }
            }
        }
        int[] resArray = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            resArray[i] = res.get(i);
        }
        return resArray;
    }
}
