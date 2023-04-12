/*public class MethodOverloading {
    static int sum(int a,int b){
        return a+b;
    }
    static double sum(double a,double b){
        return a+b;
    }
    static double sum(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        // int rvalue=sum(2,3); 
        // System.out.println(rvalue);
        System.out.println(sum(2,3));
        //System.out.println(sum(2.3,4.5));  this line has error
        System.out.println(sum(2.5,7.8));
        System.out.println(sum(3.44,7.44,4.34));
    }
}*/

//Greatest number using method overloading:
/**
 * MethodOverloading
 */
public class MethodOverloading {
    static int myGreatest(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    static int myGreatest(int a,int b,int c){
        if(a>b){
            return a;
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }

    }
    public static void main(String[] args) {
        System.out.println(myGreatest(3,4)+"is greatest");
        System.out.println(myGreatest(30,4,7)+"is greatest");
    }
}
