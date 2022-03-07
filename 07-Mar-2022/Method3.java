public class Method3{
public int add(int a,int b)
        {
        int sum=a+b;
        return sum;
        }
        public static void main(String[]args)
        {
            Method3 m = new Method3();
            int x=m.add(5,4);
            System.out.println("sum is:"+x);
        }
        }
