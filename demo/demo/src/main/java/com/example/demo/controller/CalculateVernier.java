package com.example.demo.controller;

import java.util.HashMap;

public class CalculateVernier {

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7};
        int tarGet = 9;
        int[] fun = fun(intArray, tarGet);
        for (int i = 0; i < fun.length; i++) {
            System.out.println(fun[i]);
        }
    }
    public static int[] fun(int[] intArray,int tarGet) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < intArray.length; i++) {
            if (hm.containsKey(tarGet - intArray[i])) {
                return new int[]{hm.get(tarGet - intArray[i]),i};
            }
            hm.put(intArray[i],i);
        }
        return null;
    }
}


class Solution {
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        boolean b = canJump(arr);
        System.out.println(b);
    }
}
