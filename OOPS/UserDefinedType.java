package OOPS;

import com.sun.tools.javac.Main;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
class Student{
    String name;
    int rno;
    double cgpa;
    void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
}

public class UserDefinedType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "Khushi";
        s1.rno = sc.nextInt();
        s1.cgpa = 8.5;

        Student s2 = new Student();
        s2.name = "Lavish";
        s2.rno = 33;
        s2.cgpa = 9.2;

        Student s3 = new Student();
        s3.name = "Anagha";
        s3.rno = 41;
        s3.cgpa = 8.1;

        s1.print();
        s2.print();
        s3.print();
    }
}
