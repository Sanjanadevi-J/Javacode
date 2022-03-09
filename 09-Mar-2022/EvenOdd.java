import java.util.Scanner;
public class OddEven {
    public void odd(int num,int digit){
        System.out.print("\nodd :");
        while(num!=0) {
            digit = num % 10;
            int[]arr=new int[];
            if(digit%2==1){
            for(arr[digit]=1;arr[digit]<=100);

                System.out.print(arr[digit]);
            }
            num = num / 10;
        }
    }
    public void even(int num,int rem){
        System.out.print("\neven:");
        while(num!=0) {
            rem = num % 10;
            if(rem%2!=1){
                System.out.print(rem+",\b");
            }
            num = num / 10;
        }
    }
    public static void main(String args[]) {
        int num =0,rem=0,digit=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        OddEven oe=new OddEven();
        oe.odd(num,digit);
        oe.even(num,rem);
    }
}