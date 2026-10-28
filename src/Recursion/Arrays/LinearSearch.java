package Recursion.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int arr[] , int target, int index){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return search(arr , target , index+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int target = sc.nextInt();
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(search(arr , target ,index));
    }
}
