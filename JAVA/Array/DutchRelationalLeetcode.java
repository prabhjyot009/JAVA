public class DutchRelationalLeetcode {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,2,0};
        //sort array
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                i=0;
                arr[i]=arr[i]+arr[i-1];
                arr[i-1]=arr[i]-arr[i-1];
                arr[i]=arr[i]-arr[i-1];
            }
                }
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]);
                }
            }
        }
