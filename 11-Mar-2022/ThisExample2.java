class Animal {
    Animal() {
        this("cat");
        System.out.println("This is animal class");
    }
    Animal(a) {
        System.out.println(a + " is a animal");
    }
}
public class ThisExample2{
        public static void main(String[]args){
            Animal a = new Animal();
        }
    }

