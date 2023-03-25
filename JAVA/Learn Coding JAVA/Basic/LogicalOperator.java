/**
 * LogicalOperator
 */
public class LogicalOperator {

    public static void main(String[] args) {
        System.out.println("Logical AND:");
        System.out.println(20>10&&10<20);
        System.out.println(20>10&&10>20);
        System.out.println(20<10&&10>20);
        System.out.println("Logical OR:");
        System.out.println(20>10||10<20);
        System.out.println(20>10||10>20);
        System.out.println(20<10||10>20);
        System.out.println("Logical NOT:");
        System.out.println(!(10<20));
        System.out.println(!(10>20));
    }
}