public class Override {
    void show()
    {
        System.out.println("Super class");
    }
    class OverRide extends Override
    {
        void show()
        {
            System.out.println("Subclass");
        }
    }
    public static void main(String[]args) {
        Override or=new Override();
        or.show();
    }
}