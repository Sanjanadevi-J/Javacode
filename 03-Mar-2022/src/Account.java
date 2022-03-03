public class Account {
    int acc_no;
    String name;
    float amount;

    void get(int a, String n,float am)
    {
         a = acc_no;
         n = name;
         am = amount;
    }
    float deposit(float amt) {
        amount = amount + amt;
        return amount;
    }
    float withdraw(float amt) {
        amount = amount - amt;
        return amount;
    }
    void display()
    {
        System.out.println("acc="+acc_no"\n name"+name"\namount"+amount);
    }
    public static void main(String[]args)
    {
        Account acc = new account();
        acc.get(45567832,"John",40000);
        acc.deposit(10000);
        acc.withdraw(500);
        acc.display();
    }
}