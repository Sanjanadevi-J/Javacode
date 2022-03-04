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
        int i = length * width;
        return i;

    }
    public static void main(String[]args)
    {
        Rectangle rec = new Rectangle();
        rec.insert(5,10);
        rec.area();
    }
}
