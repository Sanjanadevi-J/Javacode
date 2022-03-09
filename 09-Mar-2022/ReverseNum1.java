import java.util.Scanner;
public class ReverseNum {
    public static void main(String[]args) {
        int number = 0,reverse = 0;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        for(;num!=0;){
            int remainder = num%10;
            reverse=reverse*10 + remainder;
            number = number/10;
        }
        System.out.println("reversed number is : "+reverse);
    }
}