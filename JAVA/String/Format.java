import java.util.ArrayList;

public class Format {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));
        System.out.println("a"+3);

        //+operator only works with primitive data types
        //+operator works with String and primitive data types
        System.out.println("kunal"+ new ArrayList<>());
        System.out.println("kunal"+ Integer.valueOf(56));
        //right way to do it
        String ans=new Integer(56)+""+new ArrayList<>();
        System.out.println(ans);
    }    
}
