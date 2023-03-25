public class String22 {
    public static void main(String[] args)
    {

        String s="abbccc";
        int[] arr=new int[127];
        
        for(int i=0;i<s.length()-1;i++)
        {
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
        }
        int max=-1;
        char c =' ';
        for(int i=0;i<s.length();i++)
        {
            if(max<arr[s.charAt(i)])
            {
                max=arr[s.charAt(i)];
                c =s.charAt(i);
            }
            System.out.println("The maximum is:"+c);
        }
    }
}
        //Reverse String
        /*String s="deepak";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);*/