interface show {
    void display();
}
class Interface1 implements show {
     public void display()
    {
        System.out.println("Interface is displayed ");
    }
    public static void main(String[]args) {
        Interface1 i1=new Interface1();
        i1.display();
    }
}