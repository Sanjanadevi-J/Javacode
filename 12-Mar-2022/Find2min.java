import java.util.*;
public class FindMinMax {
    static void find(int array[]){
        int min =array[0];
        int secondmin= array[0] ;
        for(int i=0;i<array.length;i++){
            for (int j = 0; j < array.length; j++){
            if (array[i] < min ){
                min= array[i];
                    if(array[j] <secondmin)
                        secondmin = array[j];
            }
            }
        }
        System.out.println("Minimum number is:"+secondmin);
    }
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        int array[] = new int[number];
        System.out.print("Array:");
        for(int i=0;i<number;i++){
            array[i]=input.nextInt();
            System.out.print(array[i]+",");
        }
        System.out.println("\b");
        find(array);
    }
}