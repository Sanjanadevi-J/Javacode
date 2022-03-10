import java.util.Scanner;
public class EvenOdd{
    public static void main(String[]args){
        int num=0,rem=0;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        for(;num!=0;){
            rem=num%10;
            num=num/10;

            System.out.println("Even:");
            for(; rem <= num;)
            {
                if(rem % 2 == 0)
                {
                    System.out.print(rem+ "\n");
                }
            }
            System.out.println("Odd:");
            for(; rem <= num; )
            {
                if(rem% 2 == 1)
                {
                    System.out.print(rem + "\n");
                }
            }
        }



    }

}