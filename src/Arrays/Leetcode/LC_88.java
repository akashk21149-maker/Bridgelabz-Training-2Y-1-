package Arrays.Leetcode;

import java.util.Arrays;

public class LC_88 {
    public static int[] mergeSort(int nums1[] , int nums2[]){
        int m = nums2.length;
        for(int i=0;i<m;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int arr[] = mergeSort(nums1,nums2);
        System.out.println(Arrays.toString(arr));
    }
}
