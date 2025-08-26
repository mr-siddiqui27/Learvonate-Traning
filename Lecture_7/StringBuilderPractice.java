package Lecture_7;

public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Vaishu");
        System.out.println(sb);

        sb.deleteCharAt(5);
        System.out.println(sb);

    }
}
