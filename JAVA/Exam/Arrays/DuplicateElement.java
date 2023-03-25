//Write a Java program to find the duplicate values of an array of integer values.
//Int values
public class DuplicateElement {
    public static void main(String[] args) {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
    }
}
//string values
public class DuplicateElement {
    public static void main(String[] args) 
        {
            String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
     
            for (int i = 0; i < my_array.length-1; i++)
            {
                for (int j = i+1; j < my_array.length; j++)
                {
                    if( (my_array[i].equals(my_array[j])) && (i != j) )
                    {
                        System.out.println("Duplicate Element is : "+my_array[j]);
                    }
                }
            }
        }    
    }
    