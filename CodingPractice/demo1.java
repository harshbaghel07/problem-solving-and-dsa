package CodingPractice;
//  Accept a number from user - if it is divisible by 3 print “fun” , if it is divisible 
// by 7 print “buzz” 
// and if it is divisible by both(3,7) print “fun -buzz” .
import java.util.Scanner;
public class demo1 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();

        if(n%3==0 && n%7==0){
            System.out.println("FUN-BUZZ");
        }
        else if(n%3==0){
            System.out.println("FUN");
        }
        else if(n%7==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println("Entered number is not divisible by 3 and 7");
        }
    }
}
