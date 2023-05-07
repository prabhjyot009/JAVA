public class CommonElements {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        int[] arr3={1,2,3,4,5};
        CommonElements(arr1,arr2,arr3);
    }
    static void CommonElements(int[] arr1,int[] arr2,int[] arr3){
        int x=0;
        int y=0;
        int z=0;

        while(x<arr1.length && y<arr2.length && z<arr3.length){
            if(arr1[x]==arr2[y] && arr2[y]==arr3[z]){
                System.out.println(arr1[x]);
                x++;
                y++;
                z++;
            }
            else if(arr1[x]>arr2[y]){
                y++;
            }
            else if(arr2[y]>arr3[z]){
                z++;
            }
            else{
                x++;    
            }
        }
    }
}
//Big O n
//now Big O of n cube:
public class CommonElements {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        int[] arr3={1,2,3,4,5};
        CommonElements(arr1,arr2,arr3);
    }
    static void CommonElements(int[] arr1,int[] arr2,int[] arr3){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length-1; j++) {
                for (int k = 0; k < arr3.length-1; k++) {
                    if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                        System.out.println(arr1[i]);
                    }
                }
            }
        }
    }
}