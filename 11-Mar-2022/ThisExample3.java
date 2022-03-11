class Vehicle{
    void bike(){
        this.bicycle();
        System.out.println("This is  a bike");
    }
    void bicycle(){
        System.out.println("This is a bicycle");
    }
}
public class ThisExample3 {
    public static void main(String[]args){
      Vehicle  a = new Vehicle();
      a.bike();
    }
}