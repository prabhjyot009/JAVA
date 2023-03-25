package Strings;
//Write a Java program to remove all adjacent duplicates recursively from a given string.

import java.util.Scanner;

public class RemoveduplicateString {
   /*  public static void check(String[] args) {
        if(str.length()<=1)
         {
             System.out.println(str);
             return;
         }
         String n=new String();
         int count=0;
         for(int i=0;i<str.length();i++)
         {
             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
             {
                 if(i<str.length()-2 &&str.charAt(i)!=str.charAt(i+2))
                 i+=2;
                 else
                 i++;
                 count++;
             }
             if(i!=str.length()-1)
             n=n+str.charAt(i);
             else
             {if(i==str.length()-1 && str.charAt(i)!=str.charAt(i-1))
                 n=n+str.charAt(i);
             }
         }
         if(count>0)
         check(n);
         else
         System.out.println(n);
     }

public static void main (String[] args)
  {
    String ab="aabaarbarccrabmq";
    System.out.println("The given string is: "+ab);
    System.out.println("The new string after removing all adjacent duplicates is:");

    check(ab);
    }
    }

public class RemoveduplicateString{
    public static void main(String[] args) {
        String str="aabcddcb";        
        System.out.println("The given string is:"+str);
        int l=str.length();

        for(int i=0;i<l;i++)
        {
            (str.charAt(i))++;
        }

        int max=-1;
        char c=" ";

        for(int i=0;i<l;i++)
        {
            if(max < ctr(str.charAt(i)))
            {
                max=ctr(str.charAt(i));
                c=str.charAt(i);
            }
        }
        return c;
    }
}
*/
public static void main(String[] args) {
    
    Scanner scr=new Scanner(System.in);
    System.out.println("Input data is:");
    String str=scr.nextLine();
    String dupchar=" ";
    System.out.println("Input data is:"+str);

    for(int i=0;i<str.length();i++)
    {
        for(int j=i+1;j<str.length();j++)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                String s=Character.toString(str.charAt(i));
                if(!dupchar.contains(s))
                {
                    dupchar=dupchar+str.charAt(i);
                }
                break;
            }
        }
    }
    System.out.println("Duplicate character is"+dupchar);
}
}