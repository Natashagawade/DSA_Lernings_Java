package OOPS;

public class StudentData {
    public static class StudentsData{
        String name;
        int rno;
        int[] marks;
        StudentsData(int s){
            marks = new int[s];
        }
    }
    public static void main(String[] args) {
        StudentsData s1 = new StudentsData(4);
        StudentsData s2 = new StudentsData(6);
        s1.marks[0] = 34;
        s1.marks[1] = 89;
        s1.marks[2] = 52;
        s1.marks[3] = 96;
        s2.marks[1] = 78;
        s2.marks[0] = 60;
    }
}
