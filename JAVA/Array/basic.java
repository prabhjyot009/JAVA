//collection of datatype

import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        
        //syntax:
        //datatype[] variable_name=new datatype[size];
        //store 5 roll numbers;
        // int[] rollnos=new int[5];
        // //or directly
        // int[] rollnos2={10,20,30,40,50};
        //all the type of the data in the array should be equal you can not add float int string boolean.
         

        // int[] rollnos; //declaration of array. ros is getting defined in the stack
        // rollnos=new int[5]; //initialisation:actually here object is being created int the memory(heap)
        // int[] rollnos=new int[5];
        // System.out.println(rollnos[1]);

        //String array:
        String[] arr=new String[5];
        System.out.println(arr[0]);
        
        // for(String a:arr){
        //     System.out.println(a);
        // }
    }
}
