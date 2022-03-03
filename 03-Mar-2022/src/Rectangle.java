public class Rectangle()
{
    public int length,width;
    void insert(int length,int width)
    {
        this.length = length;
        this.width = width;
    }
    void area()
    {
        return length * width ;

    }
    public static void main(String[]args)
    {
        Rectangle rec = new Rectangle();
        rec.insert(5,10);
        rec.area();
    }
}
