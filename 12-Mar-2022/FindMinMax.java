import java.util.*;
public class FindMinMax {
    public static void main(String[]args){
        int number;
        int min=0;
        int max= 0;
        Scanner input= new Scanner(System.in);
        number = input.nextInt();
        int array[] = new int[number];
        System.out.print("Array:");
        for(int i=0;i<number;i++){
            array[i]=input.nextInt();
            System.out.print(array[i]+",");
        }
        System.out.println("\b");
        for(int i=1;i<number;i++){
            if(array[i]<array[0]){
                min = array[i];
            }
            else if(array[i]>array[0]){
                max=array[i];
            }

        }
        System.out.println("Minimum number is:"+min);
        System.out.println("Maximum number is:"+max);
    }
}