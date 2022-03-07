public class Method4 {
    int num;
    void check()
    {
        if (num%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
    public static void main(String[]args) {
        Method4 m = new Method4();
        m.num = 10;
        m.check();
    }
}
