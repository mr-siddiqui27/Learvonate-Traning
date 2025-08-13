package Lecture_4;

public class Loops {
    public static void main(String[] args) {

//      Factorial

        int n = 10;
        long fact = 1;
        for(int i=1; i<=n; i++){
            fact *=i;
        }
        System.out.println(fact);


//      Even Number between a and b

        int a =9;
        int b =50;

        if(a%2==0){
            for(int i=a; i<=b; i+=2){
                System.out.print(i+" ");
            }
        }else{
            for(int i=a+1; i<=b; i+=2){
                System.out.print(i+" ");
            }
        }
        System.out.println();


//      sum of digits abd reverse number

        int num = 645;
        int sum = 0;
        int reverse = 0;
        while(num>0){
            int rem = num%10;
            sum += rem;
            num /=10;
            reverse = reverse*10 + rem;
        }
        System.out.println("Sum of digits: "+sum);
        System.out.println("reverse of number: "+reverse);


//      Pattern printing

//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//      Pyramid

        for(int i=0; i<n; i++){

            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }

            for(int l=0; l<n-i-1; l++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}
