/**
 * LocalInstanceStatic
 */
class LocalInstanceStatic {
   /*  static int b=20;//Static
    int a=10;//Instance
    public static void main(String[] args) {
        int c=30; //Local
        LocalInstanceStatic ref = new LocalInstanceStatic();
        System.out.println(c);
        System.out.println(LocalInstanceStatic.b);
        System.out.println(ref.a);
    }*/
    static int a=10;
    void fun()
    {
        int b=10;
        System.out.println(a+" "+b);
        ++a; ++b;
    }
    public static void main(String[] args) {
        LocalInstanceStatic ref = new LocalInstanceStatic();
        ref.fun();
        ref.fun();
    }
}