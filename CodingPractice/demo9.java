package CodingPractice;

public class demo9 {
    public static void printThirdHighest(int []arr){
        int h=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        int t=Integer.MIN_VALUE;

        for(int n:arr){
            if(n>h){
                t=s;
                s=h;
                h=n;
            }
            else if(n>s && n!=h){
                t=s;
                s=n;
            }
            else if(n>t && n!=s){
                t=n;
            }
        }
        System.out.println("Highest Number h:"+h);
        System.out.println("Second Highest Number s:"+s);
        System.out.println("ThirdHighest Number t:"+t);
    }
    public static void main(String[]args){
        int []arr={9,7,5,2,7,1,6,6,0,3};
        printThirdHighest(arr);
    }
}
