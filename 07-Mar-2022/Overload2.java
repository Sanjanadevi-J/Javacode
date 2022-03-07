public class Overload2 {
    double multiple(double a,int b) {
     return a *b;
    }
    float multiple(float a, float b,float c) {
        return a*b*c;
    }
    public static void main(String[]args)
    {
        Overload2 ol2 = new Overload2();
        System.out.println("Answer is= "+ol2.multiple(3.77f,6.41f,9.99f) +"\n");
        System.out.println("Answer is: "+ol2.multiple(5.22,8));
    }
}