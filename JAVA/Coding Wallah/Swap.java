public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //using third variable
        int temp=0;
        temp=a; //a->temp
        a=b;    //10->20
        b=temp; //20->10
        System.out.println(a);
        System.out.println(b);
        //without using third variable
        a=a+b;  //10+20=30
        b=a-b;  //30-20=10
        a=a-b;  //30-10=20
        System.out.println(a);
        System.out.println(b);
    }
}
