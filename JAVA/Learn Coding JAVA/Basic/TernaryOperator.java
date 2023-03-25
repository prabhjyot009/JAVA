public class TernaryOperator {
    public static void main(String[] args) {
        /*int a=10,b=20,max;
        max=(a>b)? a:b;
        System.out.println(max);*/
        int a=10,b=20,c=30,max;
        max=(a>b) ? (a>c ? a:c) : (b>c ? b:c);
        System.out.println(max);
    }
}
