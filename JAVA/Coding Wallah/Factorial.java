//5=5*4*3*2*1
public class Factorial {
    public static void main(String[] args) {
        int i=5;
        int fact=1;
        for(;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
