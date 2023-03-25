//Object and classes
//defining a student class
/*class A
{
    int id;
    String name;
    public static void main(String[] args)
    {
        A object =new A();
        System.out.println(object.id);
        System.out.println(object.name);
    }
}*/
//Java Program to demonstrate having the main method in   
//another class
/*class A
{
    int id;
    String name;
}
class testA
{
    public static void main(String[] args)
    {
        A object=new A();
        System.out.println(object.id);
        System.out.println(object.name);
    }
}*/
//Initialization through reference
/*
// Overloading
class overloading
{

        static int add(int a,int b,int c)
        {return(a+b+c);}
        static int add(int a,int b)
        {return(a+b);}    
}
class A
{
    public static void main(String[] args)
    {
        System.out.println(overloading.add(1, 5,7));
        System.out.println(overloading.add (1,5));
    }
}
*/
//Array initialization of a method
/*class A
{
    public static void main(String[] args)
{
    int arr[][]=new int[3][];
    arr[0]=new int[3];
    arr[1]=new int[4];
    arr[2]=new int[2];

    int count=0;

    for(int i=0;i<arr.length;i++)
    {
    for(int j=0;j<arr[i].length;j++)
    {arr[i][j]=count++;
    }}
    for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[i].length;j++)
          System.out.print(arr[i][j]+" ");  
        }  
        System.out.println();//new line  
    }
}*/

import java.util.Scanner;
class A
{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        
    }
}
