import java.util.*;
public class Forloop2 {
    public static void main(String[]args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-i;j>1;j--){
                System.out.print(" hi");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" world ");
            }
            System.out.println();
        }

    }
}