package OOPS;

public class RevisionOOPS {
    private static class Pokemon{
        String name;
        int hp;
        int speed;
        int attack;
        int defence;
        String type;
    }
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu";
        p1.type = "Electric";
        Pokemon p2 = new Pokemon();
        p2.name = "Charizard";
        p2.type="Fire";
        Pokemon p3 = p1;   //Shallow copy of p1
        p3.type = "Water";
        System.out.println(p1.type);
    }

}
