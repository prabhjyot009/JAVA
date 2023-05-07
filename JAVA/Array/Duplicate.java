import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,4,6};
        
        Set<Integer> uniqueNumber =new HashSet<>();
        boolean isDuplicate=false;

        for (int i = 0; i < arr.length; i++) {
            if(uniqueNumber.contains(arr[i])){
                isDuplicate=true;
                System.out.println("Duplicate element:"+arr[i]);
                arr[i]=arr[arr.length-1];
                arr[arr.length-1]=0;
                arr.length--;
            }
            else{
                uniqueNumber.add(arr[i]);
            }
        }
    }
}

//save output in new array and print it at last
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,4,6};
        int[] duplicate=new int[arr.length];
        int index=0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i]==arr[j]){
                    duplicate[index]=arr[i];
                    index++;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}

