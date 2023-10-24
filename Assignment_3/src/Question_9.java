/* Write a program to reverse a Three digit number. */
public class Question_9 {
    public static void main(String[]args){
        int num=654,x,y,z;
        x=num%10;
        y=num/10%10;
        z=num/100;
        System.out.println("Reverse no= "+x+y+z);
    }
}
