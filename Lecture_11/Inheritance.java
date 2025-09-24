package Lecture_11;

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("tommy");
        dog.eat();
    }
}

class Animal{
    String name;
    void eat(){
        System.out.println(name+" is eating");
    }

    public Animal(String name) {
        this.name = name;
    }
}
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
}
