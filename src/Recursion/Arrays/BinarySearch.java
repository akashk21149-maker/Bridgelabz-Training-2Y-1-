package Recursion.Arrays;

public class BinarySearch {
    public static int search(int arr[] , int s , int e ,int target){
        if(s>=e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return search(arr, mid+1, e, target);
        }else{
            return search(arr, s, mid-1, target);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,66,6};
        int target = 6;
        int s = 0;
        int e = arr.length-1;
        System.out.println(search(arr , s , e ,target));
    }
}
