/*
1. Two Sum
You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
[2,7,11,15]
[0,4,3,0]
*/
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans= new int[2];
        int[] sorted=new int[nums.length-1];
        int len=nums.length%2==0?nums.length:nums.length+1;
    for(int i=0;i<nums.length-1;i++){
        if (nums[i]<=nums[i+1]) {
            sorted[i]=1;
            }else{
                sorted[i]=0;
            }
    }
           
    if(Arrays.stream(sorted).sum()==nums.length){
        for(int j=0;j<nums.length;j++){
            for(int k=j;k<nums.length;k++){
                if(target-nums[j]==nums[len/2] && j != len/2){
                    ans[0]=j;
                    ans[1]=len/2;
                   
                }else{
                  if((target-nums[j])>nums[len/2]){
                    j=len/2;
                }else{
                    len=((len/2)%2==0)?(len/2):(len+1/2);
                }
                }
            }
        }
    }else{
        for(int j=0;j<nums.length;j++){
            for(int k=j;k<nums.length;k++){
                if(target-nums[j]==nums[k] && j != k){
                    ans[0]=j;
                    ans[1]=k;
                   
                }
            }
        }
    }
    return ans;
}}