package Recursion.Strings;

public class VowelsInString {
    public static int countVowel(String name , int index ){
        if(index == name.length()) {
            return 0;
        }
        int sum=0;
        int count = 0;
        char ch = name.charAt(index);
        if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u'){
             count++;
        }
        countVowel(name, index+1);
        return sum+=count;
    }
    public static void main(String[] args) {
        String name = "akash";
        int index = 0;
        System.out.println(countVowel(name,index));
    }
}
