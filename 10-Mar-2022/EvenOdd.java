import java.util.Scanner;
public class EvenOdd{
    public static void main(String[]args){
        int num=0,rem=0;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        for(;num!=0;){
            rem=num%10;
            num=num/10;
            {
                System.out.print("even:");
                for(;rem%2!=1;rem++){
                    System.out.print(rem+",\b");
                }
            }
            System.out.println("\n");
            {
                System.out.print("odd:");
                for(;rem%2!=0;rem++){
                    System.out.print(rem+",\b");
                }
            }


        }

    }
}