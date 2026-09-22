package Arrays.Leetcode;

import java.util.Arrays;

public class LC_167 {
    public static int[] twoSum(int nums[], int target){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            if(nums[start]+nums[end]==target){
                return new int[]{start+1,end+1};
            } else if (nums[start]+nums[end]<target) {
                start++;
            }else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int nums[] = {2,7,11,15};
        int target = 9;
        int arr[]=twoSum(nums,target);
        System.out.println(Arrays.toString(arr));
    }
}
