/*public class PalindromeMethod {
    static int myPalin(int num){
        int rev=0;
        int og=num;
        while(num>0){
            rev=(rev*10)+num%10;
            num=num/10;

        }
        if(og==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        return 0;
    }
    public static void main(String[] args) {
        myPalin(121);
    }
}*/

//using object:
public class PalindromeMethod {
    void myPalin(int num){
        int rev=0;
        int og=num;
        while(num>0){
            rev=(rev*10)+num%10;
            num=num/10;
        }
        if(og==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromeMethod obj=new PalindromeMethod();
        obj.myPalin(121);
    }
}