public class MinMAX {

    static int getMin(int[] arr,int n){
        int res=arr[0];
        for(int i=0;i<n;i++)
            res=Math.min(res,arr[i]);
            return res;
    }
    static int getMax(int[] arr,int n){
        int res=arr[0];
        for(int i=0;i<n;i++)
            res=Math.max(res,arr[i]);
            return res;
    }
    public static void main(String[] args) {
        int[] arr={23,4,5,2,3,1,78};
        int n=arr.length;
        System.out.println("Minimum number is:"+getMin(arr,n));
        System.out.println("Maximum number is:"+getMax(arr,n));
    }
}
