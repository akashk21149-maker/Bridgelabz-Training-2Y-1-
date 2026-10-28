package Recursion.Strings;

public class RemoveLetter {
    public static String remove(String name , int index){
        if(index == name.length()){
            return "";
        }
        String small = remove(name , index+1);
        char ch = name.charAt(index);
        char ch1 = 'b';

        if(ch == 'a'){
            return small;
        }
        else{
            return ch+small;
        }
    }
    public static void main(String[] args) {
        String name = "abcabc";
        int index = 0;
        System.out.println(remove(name,index));
    }
}
