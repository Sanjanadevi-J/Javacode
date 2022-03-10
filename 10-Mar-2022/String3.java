public class String3{
    public static void main(String[]args){
        String n=" Hello ";
        n.concat("world");
        System.out.println(n);
        String m=n.concat(" World ");
        System.out.println(m);
        System.out.println(m.length());
        System.out.println(n.toUpperCase());
        System.out.println(n.toLowerCase());
        System.out.println(n.substring(2,4));
        System.out.println(m.trim());
        System.out.println(m.isEmpty());
        System.out.println(n.startsWith(" H"));
        System.out.println(m.endsWith("d"));
        System.out.println(m.contains("b"));
    }
}