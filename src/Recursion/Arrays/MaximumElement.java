package Recursion.Arrays;

import java.util.Scanner;

public class MaximumElement {
    public static int max(int arr[] , int index){
        if(index == arr.length-1){
            return arr[index];
        }
        int small = max(arr , index+1);
        return Math.max(small , arr[index]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int arr[] = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(max(arr,index));
    }
}
