

public class inheritance {

    public static void main(String args[])
    {
        Dog doggo = new Dog();
        doggo.walk();
        doggo.tail();
    }
    
}

// base class / parent class
class Animal{

    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breadth");
    }
}


//derived class / child class
class Mammals extends Animal{
    void walk(){
        System.out.println("walk");
    }
}

class Dog extends Mammals{
       void tail(){
        System.out.println("tail");
    }
}

