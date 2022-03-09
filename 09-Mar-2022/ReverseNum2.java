import java.util.Scanner;
public class ReverseNum2 {
    static int recursion(int num) {
        if(num<10) {
            System.out.println(num);
            return 0;
        }
        else {
            System.out.println(num%10);
            recursion(num/10);
            return 0;
        }
    }
    public static void main(String[]args) {
        int num=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        recursion(num);
    }
}