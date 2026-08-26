package Arrays.Logical_problems;

import java.util.Scanner;

public class FirstRepeatingElement{

    public static int firstRepeating(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array :-");
        int arr[] = new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(firstRepeating(arr));

    }
}