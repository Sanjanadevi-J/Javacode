import java.util.*;
public class EvenOdd{
    public static void main(String args[]){
        int number=0;
        Scanner sc = new Scanner(System.in);
        number= sc.nextInt();
        String s=Integer.toString(number);
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        System.out.print("even:");
        for(int j=0;j<ch.length;j++) {
            int num=ch[j];
            if(j%2==0)
                System.out.print(c+",");
        }
        System.out.print("\b\n");
        System.out.print("odd:");
        for(int j=0;j<ch.length;j++) {
            int num=ch[j];
            if(j%2!=0){
                System.out.print(j+",");
            }
        }
        System.out.println("\b");



    }
}