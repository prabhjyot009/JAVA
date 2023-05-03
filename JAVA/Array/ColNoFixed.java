public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        //rows:
        for(int rows=0;rows<arr.length;rows++){
            //coloumns:
            for(int cols=0;cols<arr[rows].length;cols++){
                System.out.print(arr[rows][cols]+" ");
            }
            System.out.println();
        }
    }
}
