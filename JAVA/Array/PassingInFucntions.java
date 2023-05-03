import java.util.Arrays;

public class PassingInFucntions {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[3]=60;
    }
}

//Strings are immuatable in java and Arrays are mutable(you can change the object) in java

