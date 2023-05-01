public class Fruits {
    int price;
    String name;

    public static void main(String[] args) {
        Fruits f = new Fruits();
        Fruits f1 = new Fruits();
        f.price = 10;
        f.name = "Apple";
        f1.price = 20;
        f1.name = "Orange";
        System.out.println(f.name+" "+f.price);
        System.out.println(f1.name+" "+f1.price);
    
    }
}
