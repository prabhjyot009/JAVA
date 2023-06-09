// public class Q1 {
//     public static void main(String[] args) {
//         int[] arr={1,3,19,14,26};
//         int target=19;
//         int ans=linearSearch(arr, target);
//         System.out.println(ans);
//     }
//     //search in the array if the item found return index
//     //if not found return -1
//     static int linearSearch(int[] arr,int target){
//         if(arr.length==0){
//             return -1;//false
//         }
//         // for (int index = 0; index < arr.length; index++) {
//         //     int element=arr[index];
//         //     if(element==target){
//         //         return index;
//         //     }
//         // }
//         for(int element: arr){
//             if(element==target){
//                 return element;//true
//             }
//         }
//         return -1;//false
//     }
// }
//worst case time complexity of an linear
//search is O(n) and best:O(1){constant}

import java.util.Arrays;

import javax.swing.text.html.parser.Element;

/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=4;
        int result=linearSearch(arr,target);
        System.out.println(result);

    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        // for(int index=0;index<arr.length;index++){
        //     int element=arr[index];
        //     if(element==target){
        //         return index;
        //     }
        // }
        for(int element:arr){
            if(element==target){
                return element;
            }
        }
        System.out.println(Arrays.toString());
        return -1;
    }
}