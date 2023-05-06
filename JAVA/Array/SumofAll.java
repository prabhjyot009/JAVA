// public class SumofAll {
//     public static void main(String[] args) {
//         int[] a={1,2,3,4,5};
//         int sum=0;
//         for (int i = 0; i < a.length; i++) {
//             sum=sum+a[i];
//         }
//         System.out.println(sum);
//     }
// }
// public class SumofAll {
//     public static void main(String[] args) {
//         int[] a={1,2,3,4,5};
//         int even=0;
//         int odd=0;
//         for (int i = 0; i < a.length; i++) {
//             if(a[i]%2==0){
//                 even+=a[i];
//                 System.out.println(a[i]+"Even");
//             }
//             else{
//                 odd+=a[i];
//                 System.out.println(a[i],"Odd");
//             }
//         }
//         System.out.println(even);
//         System.out.println(odd);
//     }
// }

// public class SumofAll {
//     public static void main(String[] args) {
//         int[] a={1,2,3,4,5};
//         int evencount=0;
//         int oddcount=0;
//         for (int i = 0; i < a.length; i++) {
//             if(a[i]%2==0){
//                 evencount+=1;
//                 System.out.println(a[i]+"Even");
//             }
//             // else{
//             //     odd+=1;
//             //     System.out.println(a[i],"Odd");
//             // }
//         }
//         System.out.println(evencount);
//         // System.out.println(oddcount);
//     }
// }

public class SumofAll {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int evencount=0;
        int[] evenarr=new int[0];
        int evenindex=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                evenarr[evenindex]+=a[i];
                evenindex++;
                System.out.println(a[i]+"Even");
            }
        }
        System.out.println(evenarr);
    }
}
