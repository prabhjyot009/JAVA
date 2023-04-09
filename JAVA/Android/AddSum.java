package JAVA.Android;

// public class AddSum{
//     public static void main(String[] args) {
//         int num1;
//         num1=10;
//         int num2=20;
//         int sum=num1+num2;

//         System.out.println("The sum is:"+sum);
           
//     }
// }

// public class AddSum{
//     public static void main(String[] args){
//         int sum=Add();
//         System.out.println("The sumis:"+sum);
//     }
//     public static int Add(){
//         int num1;
//         num1=10;
//         int num2=30;
//         int sum=num1+num2;
//         return sum;
//     }
// }

//using parameters
public class AddSum{
    public static void main(String[] args){
        int sum=Add(10,20);
        System.out.println("The sumis:"+sum);
    }
    public static int Add(int a,int b){
        int sum=a+b;
        return sum;
    }
}

