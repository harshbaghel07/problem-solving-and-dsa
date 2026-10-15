package CodingPractice;
//  Accept a number from user and check if it is palindrome number or not eg (121)
public class demo3 {
    public static void ispalindrome(int n){
        int orig=n;
        int r=0;
        while(n>0){
            r=r*10 + n%10;
            n=n/10;
        }
        if(orig==r){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
    public static void main(String[]args){
        ispalindrome(121);
    }
}
