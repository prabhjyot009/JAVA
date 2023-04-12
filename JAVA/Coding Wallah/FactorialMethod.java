/*public class FactorialMethod {
    static void myFact(){
        int num=5;
        int fact=1;
        while(num>0){//4>0
            fact=fact*num; 
            num=num-1;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        myFact();
    }
}*/

//using parametrized constructor: non-returntype
/*public class FactorialMethod {
    static void myFact(int num){
        int fact=1;
        while(num>0){//4>0
            fact=fact*num; 
            num=num-1;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        myFact(5);
    }
}*/

//using return type:
/*public class FactorialMethod {
    static int myFact(){
        int num=5;
        int fact=1;
        while(num>0){//4>0
            fact=fact*num; 
            num=num-1;
        }
        System.out.println(fact);
        return 0;
    }
    public static void main(String[] args) {
        myFact();
    }
}*/
//using return type with parameters:
public class FactorialMethod {
    static int myFact(int num){
        int fact=1;
        while(num>0){//4>0
            fact=fact*num; 
            num=num-1;
        }
        System.out.println(fact);
        return 0;
    }
    public static void main(String[] args) {
        myFact(5);
    }
}