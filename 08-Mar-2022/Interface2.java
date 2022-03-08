class Phone {
    void call() {
        System.out.println("make a call");
    }
    void msg() {
        System.out.println("make a chat");
    }
}
interface lock {
    void finger();
    void pattern();
}
interface camera {
    void click();
    void record();
}
class Smartphone extends Phone implements lock,camera {
    public void finger() {
        System.out.println("Finger lock");
    }
    public void pattern() {
        System.out.println("Pattern lock");
    }
    public void click(){
        System.out.println("take a photo");
    }
    public void record(){
        System.out.println("Record a video");
    }

}
public class Interface2 {
    public static void main(String[]args) {
        Smartphone sm = new Smartphone();
        sm.call();
        sm.msg();
        sm.finger();
        sm.pattern();
        sm.click();
        sm.record();
    }
}