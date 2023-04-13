/*
 * Exception

public class Exception {

    public static void main(String[] args) {
        float a=5;
        float b=2;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}*/

//to initialize how exception is thrown:
/* 
public class Exception {
    public static void main(String[] args) {
        String s=null;
        System.out.println(s.length());
    }
}*/


public class Exception {

    public Exception(String message) {
    }

    public static void main(String[] args) {
        int[] arr= new int[4];
        int i=arr[4];
        System.out.println("hello my name is");
    }

    public void printStackTrace() {
    }

    public String getMessage() {
        return null;
    }
}

//Types of Exceptions in java:
//1. Checked Exception
//2. Unchecked Exception
//3. Error

//1. Checked Exception
//1.1. Compile time exception
//1.2. Checked at compile time
//1.3. Example: IOException, SQLException, ClassNotFoundException

//2. Unchecked Exception
//2.1. Run time exception
//2.2. Checked at run time
//2.3. Example: ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException, NumberFormatException.

//3. Error
//3.1. Error is irrecoverable
//3.2. Example: OutOfMemoryError, StackOverflowError, VirtualMachineError, AssertionError, ExceptionInInitializerError.

//How to handle exception?
//1. try-catch block
//2. throws keyword
//3. throw keyword

//1. try-catch block
//1.1. try block
//1.2. catch block
//1.3. finally block

//1.1. try block
//1.1.1. try block contains the code that may throw exception
//1.1.2. try block must be followed by either catch block or finally block

//1.2. catch block
//1.2.1. catch block contains the code that will be executed if exception occurs in try block
//1.2.2. catch block must be followed by either catch block or finally block

//1.3. finally block
//1.3.1. finally block contains the code that will be executed whether exception occurs or not
//1.3.2. finally block must be followed by either catch block or finally block

//2. throws keyword
//2.1. throws keyword is used to declare exception
//2.2. throws keyword is used to declare exception at method level
//2.3. throws keyword is used to declare multiple exceptions

//3. throw keyword
//3.1. throw keyword is used to throw exception explicitly
//3.2. throw keyword is used to throw exception explicitly at method level
//3.3. throw keyword is used to throw only one exception
