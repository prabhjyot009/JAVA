/*public class MethodDemo {
    //non-return type method
    static void myMethod(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        //calling
        myMethod();
    }
}*/
//if we don't want static:
/*public class MethodDemo {
    //non-return type method
    void myMethod(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        //calling
        MethodDemo obj=new MethodDemo();
        obj.myMethod();
    }
}*/

//non return-type with parameters:
/*public class MethodDemo {
    //non-return type method
    void myMethod(){
        System.out.println("Hello");
    }
    void friend(int paisa){
        System.out.println("coming...");
    }
    public static void main(String[] args) {
        //calling
        MethodDemo obj=new MethodDemo();
        obj.friend(50);
    }
}*/

//return-type:
/*public class MethodDemo {
    static int myMehtod(){
        System.out.println("Hello");
        return 10;
    }
    public static void main(String[] args) {
        //storing return
        int rvalue=myMehtod();
        System.out.println(rvalue);
        //myMehtod();
    }
}*/

//return-type with parameters:
public class MethodDemo {
    static String myMehtod(String loc){
        System.out.println("Location");
        return "Hi";
    }
    public static void main(String[] args) {
        System.out.println(myMehtod("Hardiwar"));
    }
}