public class TwoDarray {
    public static void main(String[] args) {
        int[][] a={{10,20,30},{40,50,60}};  //MATRIX Array
        //int[][] a={{10,20},{40,50,60}};  //JAGGED Array
        for(int i=0;i<a.length;i++)//row
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }
    }
}
