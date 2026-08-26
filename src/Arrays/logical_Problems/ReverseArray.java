package Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int arr[]){
        int a = 0;
        int b = arr.length-1;
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
    public static void Display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] =  new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array before :-");
        Display(arr);
        System.out.println("array after :-");
        reverse(arr);
        Display(arr);

    }
}