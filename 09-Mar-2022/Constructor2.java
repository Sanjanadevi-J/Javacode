public class Constructor2{
    int length,breadth;
    Constructor2(int l, String b){
        length = l;
        breadth = b;
    }
    Constructor2(int l){
        length = l;
        breadth = l;
    }
    void display(){
        int area= length*breadth;
        System.out.println(area);
    }

    public static void main(String args[]){
        Constructor2 c2 = new Constructor2(12,4);
        Constructor2 c3 = new Constructor2(56);
        c2.display();
        c3.display();
    }
}