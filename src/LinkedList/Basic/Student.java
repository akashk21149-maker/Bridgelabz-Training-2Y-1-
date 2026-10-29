package LinkedList.Basic;

public class Student {
    String name;


    public Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Akash");
        System.out.println(s1.name);
    }
}