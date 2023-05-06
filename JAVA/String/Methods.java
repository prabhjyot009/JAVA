import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name="singh brar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('n'));
        System.out.println("   singh     ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }    
}
