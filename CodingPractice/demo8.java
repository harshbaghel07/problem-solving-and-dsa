package CodingPractice;

public class demo8 {
    public static void printsecondHighest(int []arr){
        int h=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;

        for(int n : arr){
            if(n>h){
                s=h;
                h=n;
            }
            else if(n>s && n!=h){
                s=n;
            }
        }
        System.out.println("Highest number is:"+h);
        System.out.println("Second highest number is :"+s);
    }
    public static void main(String[]args){
        int []arr={9,7,5,2,7,1,6,6,0,3};
        printsecondHighest(arr);
    }
}
