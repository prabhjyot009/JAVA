import java.util.Scanner;

public class PrimeMethod {
    void myPrime(int low,int high){
        while(low<=high){
            boolean checker=true;
            for(int i=2;i<low-1;i++){
                //condition for not prime
                if(low%i==0)
                    checker=false;
            }
            if(checker && low!=0 &&low!=1)
                System.out.println(low);
            low++;
    }
}
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter lower range:");
        int low=scan.nextInt();
        System.out.print("Enter high range");
        int high=scan.nextInt();
        PrimeMethod obj=new PrimeMethod();
        obj.myPrime(low,high);
    }

}
