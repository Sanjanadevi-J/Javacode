
interface Interface {
    final int a = 10;
    void display();
}

class Interface3 implements In1 {

    public void display() {
        System.out.println("Interface ");
    }


    public static void main(String[] args)
    {
        Interface3 i = new Interface3();
        i.display();
        System.out.println(a);
    }
}

