public class Array {
    public static void main(String[] args) {
        int marks[]={23,45,67,89,90};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }
    }
}