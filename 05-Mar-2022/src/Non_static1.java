public class Non_static1  {
    int product(int x, int y) {
        return x * y;
    }
    public static void main(String[] args) {
        Non_static1 N=new Non_static1();
        int ans= N.product(5,4);
        System.out.println(ans);
    }
}

