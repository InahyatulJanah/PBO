package Praktikum.sesi9.Animal;

// Superclass
class Animal {
    //Properti
    String name;

    // constructor
    public Animal (String name){
        this.name = name;
    }

    //Metode
    public void speak(){
        System.out.println("Animal speeks");
    }
}

// Sublass
class Dog extends Animal{

    // constructor
    public Dog(String name){
        super(name); //Memanggil construktor dari superclass
    }

    //override metode speak
    @Override
    public void speak(){
        System.out.println(name + "says woof");
    }
}

public class AnimalTester{
    public static void main(String[] args) {
        //membuat objek dari subclass Dog
        Dog dog = new Dog("Buddy");
        dog.speak(); //Output: Buddy says woof
    }
}
