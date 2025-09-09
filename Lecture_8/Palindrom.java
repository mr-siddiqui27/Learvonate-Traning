package Lecture_8;

public class Palindrom {
    public static boolean isPalindrome(int num){
        String str = num+"";
        int st = 0;
        int end = str.length()-1;
        while(st<end){
            if(str.charAt(st)!=str.charAt(end)) return false;
            st++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234321));
    }
}
