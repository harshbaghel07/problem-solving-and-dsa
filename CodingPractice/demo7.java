package CodingPractice;
// check the prime no between 1 to 100
public class demo7 {
    public static void isprime(int a,int b){
        for(int i=a;i<=b;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2){
                System.out.println("Number is Prime:"+i);
            }
        }
    }
    public static void main(String[]args){
        isprime(1,100);
    }
    
}
