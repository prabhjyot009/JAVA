/*class power {
    public static void main(String ar[]) {
        int n = 2;
        int i;
        double x = 2.0;
        double y = 3.0;
        int a = 2;
        int b = 3;
        double sum = 0;
        int c = 0;
        while (true) {
            sum = sum + (Math.pow(x, a) / Math.pow(y, b));
            b = b + 3;
            a = a + 3;
            c++;
            if (c == n) {
                break;
            }
        }
        System.out.println(sum);
        for (i = 0; i < n; i++) {
            sum = sum + (Math.pow(x, a) / Math.pow(y, b));
            b = b + 3;
            a = a + 3;
        }
    }
}*/
/*class A
{
    public static void main(String s[])
    {
        A b=new A(100);
        System.out.println(b.i);

        A b1=new A(100,200);
        System.out.println(b1.i);

        A b2
    }
}
class A extends B
{
    A(int x)
    {
        super(x);
    }
    A(int x,int y)
    {
        super(x,y);
    }
}
class B extends C
{
    int i;
    B(int x)
    {
        i=x;
    }
    B(int x,int y)
    {
        i=x+y;
    }
}
class C
{
    int 
}
class A
{
    public static void main(String[] args)
    {
        System.out.println("Screen display");
        for(int i=0;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println("\n");
        }
        System.out.println("Screen Displaying done");
    }
}*/
//Array*/
/*class A
{
    public static void main(String[] args)
    {
        int[] arr;
        arr= new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        for(int i=0;i<arr.length;i++)
        System.out.println("Elements in index" +i+":"+arr[i]);
    }
}*/
//Array of objects*/
/*class Student {
    public int roll_no;
public String name;

Student(int roll_no,String name)
{
    this.roll_no=roll_no;
    this.name=name;    
}
}
public class A
{
    public static void main(String[] args)
    {
        Student arr[];
        arr= new Student[5];
        arr[0]=new Student(1,"aman");
        arr[1]=new Student(2,"naman");
        arr[2]=new Student(3,"Jordan");
        arr[3]=new Student(4,"sam");
        arr[4]=new Student(5,"Khalid");

        for(int i=0;i< arr.length;i++)
        System.out.println("ELement at"+i+":"+arr[i].roll_no+" "+arr[i].name);
    }
}*/
