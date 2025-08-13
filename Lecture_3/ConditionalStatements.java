package Lecture_3;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Leap year or not

//        System.out.print("Inter a Year: ");
//        int num = sc.nextInt();
//
//        if(num%400==0 || (num%4==0 && num%100!=0)) System.out.println(num + " is a Leap Year");
//        else System.out.println(num + " is not a Leap Year");


//      find the greatest element of 3 numbers
        int a = 9;
        int b = 8;
        int c = 10;

        if(a>b && a>c) System.out.println(a + " is greatest");
        else if(b>c) System.out.println(b + " is greatest");
        else System.out.println(c + " is Greatest");

        int x = Math.max(a,b);
        int y = Math.max(x,c);
        System.out.println(y+ " is Greatest" );


        // Switch statement

//        System.out.print("Enter Day Number: ");
//        int day = sc.nextInt();
//        switch (day){
//            case 1: System.out.println("Monday"); break;
//            case 2: System.out.println("Tuesday"); break;
//            case 3: System.out.println("Wednesday"); break;
//            case 4: System.out.println("thursday"); break;
//            case 5: System.out.println("Friday"); break;
//            case 6: System.out.println("Saturday"); break;
//            case 7: System.out.println("Sunday"); break;
//            default: System.out.println("Invalid Day");
//        }

//      Check a character is alphabet or not
        char ch = 'A';
        if((ch>=97 && ch<=122) || (ch>=65 && ch<=90)){
            System.out.println("alphabate");
        }
        else {
            System.out.println("not alphabate");
        }

        if(Character.isAlphabetic(ch)){
            System.out.println("is");
        }else {
            System.out.println("not");
        }


//      Check a number is positive, negative or zero using ternary operator
        String str = (a>0)?("Positive"):((a==0)?("Zero"):("negative"));
        System.out.println(str);

    }
}
