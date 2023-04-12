/*public class Recursion {

    static void printSeries(int num){
        //this will give error because of infinity loop to solve this we need base case
        // System.out.println(num); this will use when we want to print series in reverse
        if(num>0)
            printSeries(num-1);//self calling
        System.out.println(num);
    }
    public static void main(String[] args) {
        // for(int i=0;i<5;i++)
            // System.out.println(i);
            //what we doing before
        printSeries(5);//calling
    }
}
*/

/**
 * Recursion
 */
/*public class Recursion {
    static int myPalin(int num,int rev){
    int og=num;
        while(num>0){
            rev=(rev*10)+num%10;
            num=num/10;
        }
    if(og==rev){
        System.out.println("palindrome");
        }
    else{
        System.out.println("not palindrome");
        }
    return 0;
    }
    public static void main(String[] args) {
        myPalin(121,0);
    }
}*/

//Sum using recursion in java
/*public class Recursion {
    static int sum(int num){
        if(num==0)
            return 0;
        else
            return num+sum(num-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}*/

//sum of a and b using recursion
public class Recursion {
    static int sum(int a,int b){
        if(a==0)
            return b;
        else
            return 1+sum(a-1,b);
    }
    public static void main(String[] args) {
        System.out.println(sum(5,6));
    }
}