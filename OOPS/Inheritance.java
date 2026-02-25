package OOPS;
class Pokemon{
    int power;
    String type;
    Pokemon(){}
    Pokemon(String type, int power){
        this.power = power;
        this.type = type;
    }
    void print(){
        System.out.println(this.power+" "+this.type);
    }
}
class LegendryPokemon extends Pokemon{
    String ability;      //Single level inhertance
}

class GodPokemon extends LegendryPokemon{
    char tag;         //Multilevel Inheritance
}
public class Inheritance {
    public static void main(String[] args) {
        LegendryPokemon l1 = new LegendryPokemon();
        l1.ability = "Pressure";
        l1.power = 23;
        GodPokemon g1 = new GodPokemon();
        g1.ability = "Strike";
    }
}