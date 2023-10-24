/* Write a program to calculate sum of the digits of a given number. */
public class Question_4 {
    public static void main(String[]args){
        int num=349,sum;
        sum=(num%10)+(num/10%10)+(num/100);
        System.out.println("Sum of digit is "+sum);
    }
}
