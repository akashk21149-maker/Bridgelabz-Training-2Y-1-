package Recursion.Strings;

public class IterateString {
        public static void iterate(String name , int index){
            if(index == name.length()) {
                return;
            }
            System.out.print(name.charAt(index)+" ");
            iterate(name , index+1);
        }
        public static void main(String[] args) {
            String name = "Akash";
            int index = 0;
            iterate(name,index);
        }
    }


