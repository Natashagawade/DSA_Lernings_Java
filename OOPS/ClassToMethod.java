package OOPS;

public class ClassToMethod {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(seats+" "+length+" "+type);
        }
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Kinjal";
        Car c = new Car();
        c.length = 3.99;
        c.name = "Kia Sonet";
        c.seats = 5;
        c.torque = 178;
        c.type = "SUV";

        change(c);
        System.out.println(c.seats);
        c.print();
    }

    private static void change(Car c){
        c.seats = 4;
    }
}
