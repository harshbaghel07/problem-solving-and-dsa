package CodingPractice;
//Find Fibonacci series in following pattern
public class demo5 {
    public static void isfibonacci(int n){
        int a=0;
        int b=1;
        int c;

        for(int i=0;i<=n;i++){
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[]args){
        isfibonacci(10);
    }
}
