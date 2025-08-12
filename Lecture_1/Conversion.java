package Lecture_1;

public class Conversion {
    public static void main(String[] args) {
        char ch = 'm';
        int num = ch;
        System.out.println(ch+" in Integer = "+ num );

        float fNum = num ;
        System.out.println(num + " in Float = "+ fNum);

        fNum += 3.14f;

        num = (int) fNum;
        System.out.println(fNum + " in Integer = "+ num);

        fNum = (float) num;
        System.out.println(num+ " in Float = "+fNum);
    }

}

/*
* Arithmetic Operator  (+,
*
*
*
* */
