package CodingPractice;
// Check the prime Nmunber or not
public class demo6 {
    public static void isprime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is not Prime");
        }
    }
    public static void main(String []args){
        isprime(7);
    }
}
