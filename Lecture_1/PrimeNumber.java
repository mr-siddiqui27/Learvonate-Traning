package Lecture_1;

public class PrimeNumber {
    public static void main(String[] args) {

        int n=15;
        boolean isNotPrime = false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                isNotPrime = true;
                break;
            }
        }
        if(isNotPrime){
            System.out.println(n+" is not a prime number");
        }else{
            System.out.println("it is a prime number");
        }
    }
}
