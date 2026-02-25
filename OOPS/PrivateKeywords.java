package OOPS;

import Strings.StringBuilders;

import java.util.Scanner;

class Students{
    String name = "Shagun";
    private int rno = 10;     //cannot bee changed or printed
    double cgpa;
    void print(){                 //getter
        System.out.println(name+" "+rno+" "+cgpa);
    }
    void getRolllno(){       //getter
        System.out.println(rno);
    }
    void setRollno(int x){        //setter
        rno = x;
    }
}
public class PrivateKeywords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();
        s1.name = "Natasha";
        s1.cgpa = 6.4;
        s1.print();
        s1.getRolllno();
        s1.setRollno(21);
        s1.print();
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
    }
}
