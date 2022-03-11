class World{
    String a="World";
}
class Country extends World{
    String a="Country";
    void display(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class super1{
    public static void main(String[]args){
        Country c = new Country();
        c.display();
    }

}