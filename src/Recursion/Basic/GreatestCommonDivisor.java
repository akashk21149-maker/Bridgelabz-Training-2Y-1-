package Recursion;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int gcd(int x , int y){
        if(y==0){
            return x;
        }
        int ans = gcd(y,x%y);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x,y));
    }
}
