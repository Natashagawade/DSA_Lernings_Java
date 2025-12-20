package Methods;

public class MandatoryReturn {
    public static void main(String[] args) {
        System.out.println(func(6));
    }
    public static int func(int a){
        if(a<5){
            return a;
        }
        else{
            return 0;         //Return is Mandantory for int function
        }
    }
}
