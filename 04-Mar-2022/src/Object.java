class Rectangle {
    int length,width;

    void get(int length, int width)
    {
        this.length =length;
        this.width = width;

    }
    int area() {
        int a = length * width;
        return a;
    }
}
class Square {
    int side;
    void get(int side)
    {
        this.side = side;
    }
    int area() {
        int ar=side*side;
        return ar;
    }
}

public class Object {
    public static void main(String[]args)
    {

        Rectangle o1 = new Rectangle();
        Square o2 = new Square();

        o1.get(5,10);
        o2.side = 4;
        System.out.println("Area is:"+o1.area());
        System.out.println("square area :"+o2.area());
    }
    }
