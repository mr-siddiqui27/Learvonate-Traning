package Lecture_5;

public class Recursion {

    public static long fact(int n){
        if(n==1 || n==0) return 1;
        return n*(fact(n-1));
    }

    public static void main(String[] args) {
        System.out.println("factorial = "+fact(5));
    }
}
