package OOPS;

public class Constructors {
    public static class Car{
        int seats;
        String name;
        double length;
        Car(int x, String s, double d){       //Constructor
            seats = x;
            name = s;
            length = d;
        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(5, "Sonnet", 7.98);
        c1.print();
        Car c2 = new Car(6, "Omni", 3.94);
        c2.print();
    }
}
