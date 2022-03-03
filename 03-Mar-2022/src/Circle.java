public class Circle {
    double radius , pi ;
    void display()
    {
        radius = 6;
        pi = 3.14;
        System.out.println( pi * radius * radius);
    }

    public static void main(String[] args) {


        Circle c1 = new Circle();
        c1.display();

    }

}







