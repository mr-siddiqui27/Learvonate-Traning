package Lecture_10;

public class OopsIntro {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", "2025", "Black");
        myCar.move();

        Car audi = new Car("Audi", "2025", "White");
        audi.move();
    }
}

class Car{
    String name;
    String color;
    String model;

    Car(String name, String model, String color){
        this.name = name;
        this.model = model;
        this.color = color;
    }

    void move(){
        System.out.println(name+" is moving");
    }
}
