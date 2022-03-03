public class Employee
{
    int id;
    String name;
    int salary;
    void get(int id,String name,int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void show()
    {
        system.out.println("id "+ id "name "+name"salary "+salary );

    }
    public static void main(String[]aargs)
    {
        Empolyee e1 = new Empolyee();
        e1.get(100,James,10000);
        e1.show();
    }
}
