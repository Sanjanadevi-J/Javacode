public class Sample {
    public static int a =16;
    public static void main(String[]args)
    {
        stat();
        System.out.println("Main method");
        System.out.println(Sample.a);
    }
    static
    {
        System.out.println("Static block");
    }
    public static void stat()
    {
        System.out.println("stat block");
    }
}
