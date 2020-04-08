package com.iflytek.springboottest.leetcode;

import java.util.*;

/**
 * @author zytian
 * @version v1.0
 * @since 2019-12-30 22:07
 */
public class TwoNums {

    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 0 || nums.length == 1) {
            return null;
        }
        // int[] indexs = new int[2];
        // for(int i = 0; i < nums.length; i++) {
        //     int temp = target - nums[i];
        //     for(int j = 1 + i ;j < nums.length; j++) {
        //         if(nums[j] == temp) {
        //             indexs[0] = i;
        //             indexs[1] = j;
        //             return indexs;
        //         }
        //     }
        // }

        // return null;
        List<Integer> index = new ArrayList<>();
        index.clear();
        int[] indexs = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsValue(temp)) {
                indexs[0] = i;
                indexs[1] = map.get(temp);
                return indexs;
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(13 / 2);


    }

}
