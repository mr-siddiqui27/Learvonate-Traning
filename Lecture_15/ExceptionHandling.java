package Lecture_15;

public class ExceptionHandling {

    public static void isEligible(int age) throws EligilibilityException{
        if(age>=18){
            System.out.println("Eligible");
        }else{
            throw new EligilibilityException("Age is less than 18");
        }
    }

    public static void main(String[] args) {
        try{
            int n = 5;
//            System.out.println(n/0);
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e){
            System.out.println("Exception occur: "+e);
        } catch (NullPointerException e){
            System.out.println("String is null: "+e);
        } finally {
            System.out.println("hello");
        }

        try{
            isEligible(17);
        }catch(EligilibilityException e){
            System.out.println(e);
        }

        System.out.println("Program executed");
    }
}
