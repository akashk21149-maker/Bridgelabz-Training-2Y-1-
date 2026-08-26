package Leetcode;

import java.util.Arrays;
import java.util.Scanner;


public class Leetcode_414 {
    public static int thirdMax(int[] nums) {
        int count = 1;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                count++;
            }if(count==3){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[7];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(thirdMax(nums));

    }
}