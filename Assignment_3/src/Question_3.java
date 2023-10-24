/* Write a program to make the last digit of a number stored in a variable as zero. ( Example - if x=2345 then make itx=2340) */
public class Question_3 {
    public static void main(String[]args){
        int x=2345, a;
        a=x%10;
        x=x/10;
        a=a/10;
        System.out.println(""+x+a);
    }
}
