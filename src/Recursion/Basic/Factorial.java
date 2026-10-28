package Recursion;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int small = factorial(n-1);
         return n*small;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
