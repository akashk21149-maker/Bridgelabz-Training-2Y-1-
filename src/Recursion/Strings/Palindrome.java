package Recursion.Strings;

public class Palindrome {
    public static boolean isPalindrome(String name ,  int start , int end){
        if(name.charAt(start)!=name.charAt(end)){
            return false;
        }
        if(end>=start){
            return true;
        }
        return isPalindrome(name, start+1, end-1);
    }
    public static void main(String[] args) {
        String name = "madam";
//        int index = 0;
        int start = 0;
        int end = name.length()-1;
        System.out.println(isPalindrome(name,start,end));
    }
}
