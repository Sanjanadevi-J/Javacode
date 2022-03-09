public class Constructor1{
    int i;
    Constructor1()
    {
    ;    }
    void display(){
        System.out.println("entered value of i"+i);
    }
    public static void main(String[]args){
        Constructor1 c1=new Constructor1();
        c1.display();
    }

}