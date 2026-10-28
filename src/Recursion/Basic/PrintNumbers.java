package Recursion;

public class PrintNumbers {
    public static void printInc(int n){
        // Base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }

        // Recursive call
        printInc(n-2);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        printInc(15);
    }
}
