package Lecture_5;

public class Functions {

    static double areaOfCircle(int r){
        return 3.14*r*r;
    }

    static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int radius = 5;
        double area = areaOfCircle(radius);
        System.out.println("Area of Circle is "+area);

        System.out.println(isPrime(12));
    }
}
