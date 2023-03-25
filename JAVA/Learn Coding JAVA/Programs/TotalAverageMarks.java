import java.util.Scanner;

public class TotalAverageMarks {
    public static void main(String[] args) {
        int maths,science,hindi,english,sst;
        System.out.println("Enter marks of 5 subjects");
        Scanner ref=new Scanner(System.in);
        System.out.println("Maths:");
        maths=ref.nextInt();
        System.out.println("Science:");
        science=ref.nextInt();
        System.out.println("Hindi:");
        hindi=ref.nextInt();
        System.out.println("English:");
        english=ref.nextInt();
        System.out.println("SST:");
        sst=ref.nextInt();

        int sum=maths+science+hindi+english+sst;
        System.out.println("Total Sum is:"+sum);

        double avg=sum/5.0;
        System.out.println("Total Average is:"+avg);
    }
}
