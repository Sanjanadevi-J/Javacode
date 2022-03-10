import java.util.Scanner;
public class EvenOdd{
    public static void main(String[]args){
        int num=0,rem=0;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        for(;num!=0;){
            rem=num%10;
            num=num/10;


            if(rem%2==0){
                System.out.print("even:"+rem+",\b");
            }
            else{
                System.out.print("odd:"+rem+",\b");
            }
            System.out.println("\n");
        }


    }

}
