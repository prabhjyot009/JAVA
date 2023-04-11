// Implicit TypeCasting:

// public class TypeCasting{
//     public static void main(String[] args) {
//         short sh=12;
//         int intData=sh;
//         System.out.println(intData);
//         float fl=12.12f;
//         double db=fl;
//         System.out.println(db);
//     }
// }

//Explicit TypeCasting:

public class TypeCasting {
    public static void main(String[] args) {
        int intData = 12;
        // short sh=intData; this will show error to resolve this:
        short sh = (short) intData;
        System.out.println(sh);
        double db = 12.234;
        float fl =(float) db;
        System.out.println(fl);
    }
}