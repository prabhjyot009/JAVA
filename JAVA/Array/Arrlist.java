import java.util.ArrayList;
import java.util.Scanner;

public class Arrlist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.set(0, 90);
        System.out.println(list);
        System.out.println(list.contains(40));

        for(int i=0;i<=5;i++){
            list.add(in.nextInt());
        }                                                                                                                                                                                                                                                                                        
        for(int i=0;i<=5;i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);

        //using multi dimensional array:

        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list2=new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
