package Lecture_10;


public class Example {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Acer Swift go 14", "LAPTOP-5HPGPV30", "Intel(R) Core(TM) Ultra 5 125H (1.20 GHz)", "Oled", 70000);
        System.out.println(myLaptop.name);
        System.out.println(myLaptop);
     }
}

class Laptop{
    String name;
    String model;
    String processor;
    String display;
    int price;


    public Laptop(String name, String model, String processor, String display, int price) {
        this.name = name;
        this.model = model;
        this.processor = processor;
        this.display = display;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", Processor='" + processor + '\'' +
                ", Display='" + display + '\'' +
                ", price=" + price +
                '}';
    }
}
