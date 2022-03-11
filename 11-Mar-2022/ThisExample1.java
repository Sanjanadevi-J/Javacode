class ThisExample1 {
    int number;
    String name;
    ThisExample1(int number,String name) {
        this.number=number;
        this.name = name;
    }

    void show(){
        System.out.println("number:"+this.number+", "+"name:"+this.name);
    }
}
public class test{
    public static void main(String[]args){
        ThisExample1 t1 = new ThisExample1(5,"john");
        ThisExample1 t2 = new ThisExample1(6,"maxy");
        t1.show();
        t2.show();
    }

}