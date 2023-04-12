public class Prime {
    public static void main(String[] args) {
        int num=7;
        for(int i=2;i<num;i++){
            if(num%i!=0){
                System.out.println("Prime");
                break;
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }
}
