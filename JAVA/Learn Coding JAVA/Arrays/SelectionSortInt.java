public class SelectionSortInt {
    public static void main(String[] args) {
        int[] a={39,52,9,8,6,62,13};
        int min;int temp=0;
        for(int i=0;i<a.length;i++)
        {
            min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j] < a[min])  //min is used because i cannot be used again
                {
                    min=j;
                }
            }
                          //swap
                          temp=a[i];
                          a[i]=a[min];
                          a[min]=temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
    }
}
