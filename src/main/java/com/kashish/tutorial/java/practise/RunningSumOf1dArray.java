package com.kashish.tutorial.java.practise;

public class RunningSumOf1dArray {
	public int[] runningSum(int[] nums) {
        int sums = 0;
        int[] retSums = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            sums += nums[i];
            retSums[i] = sums;
        }
        return retSums;
    }


}
    