package CodingPractice;
//  Accept a start number from user and end number from user. Print all  odd 
// number between start and end number.
import java.util.Scanner;
public class demo2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Start Number :");
        int s=sc.nextInt();

        System.out.println("Enter the End Number:");
        int e=sc.nextInt();
        
        for(int i=s;i<=e;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
