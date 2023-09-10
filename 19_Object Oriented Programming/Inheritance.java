public class Inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eats();
        shark.fins = 4;
        System.out.println(shark.fins);
    }
}

class Animal{
    String Color;
    void eats(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("Swims in water");
    }
}
