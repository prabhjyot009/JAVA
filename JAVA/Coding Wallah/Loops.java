//For Loop
// public class Loops {
//     public static void main(String[] args) {
//         for(int i=1;i<=10;i++){
//             System.out.println("2 * "+i+" = "+(2*i));
//         }
//     }
// }
//Ascii value:
// public class Loops {
//     public static void main(String[] args) {
//         for(int i=0;i<=255;i++){
//             System.out.println(i+" = "+(char)i);
//         }
//     }
// }

//while loop:
// public class Loops {
//     public static void main(String[] args) {
//         int i=1;
//         while(i<=100){
//             System.out.println("sorry"+i);
//             i=i+1;
//         }
//     }
// }

//do-while:

// public class Loops {
//     public static void main(String[] args) {
//         int i=1;
//         do{
//             System.out.println("sorry"+i);
//             i=i+1;
//         }while(i<=100);
//     }
// }

//For-each:

public class Loops {
    public static void main(String[] args) {
        int[] myarray={1,2,3,4};
        for (int i : myarray) {
            System.out.println(i);
        }
    }
}