import java.util.Scanner;
public class ReverseNum {
    public static void main(String[]args) {
        int number = 0, remainder=0, reverse = 0;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        while(number!0) {
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;
        }
        System.out.println("reversed number is : "+reverse);
    }
}