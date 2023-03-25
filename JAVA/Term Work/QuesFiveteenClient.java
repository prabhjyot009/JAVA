/*Client Side*/

import java.io.*;
import java.net.*;
import java.util.*;
public class QuesFiveteenClient
{
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",8080);
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        dout.writeUTF(""+n);
        dout.flush();
        DataInputStream din=new DataInputStream(s.getInputStream());
        String str=(String)din.readUTF();
        System.out.println("Server says: "+str);
        dout.close();
        s.close();
    }
}