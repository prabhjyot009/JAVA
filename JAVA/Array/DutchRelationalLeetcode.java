    public static void main(String[] args) {
        int[] arr={0,0,1,1,2,0};
        int low=0;  //low pointer
        int mid=0; //mid pointer
        int high=arr.length-1; //high pointer
        while(mid<=high){ //loop until mid is greater than high
            if(arr[mid]==0){ //if mid is 0, swap low and mid, increment low and mid
                int temp=arr[low];
                arr[low]=arr[mid];

                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){ //if mid is 1, increment mid
                mid++;
            }

            else{ //if mid is 2, swap mid and high, decrement high
                int temp=arr[mid];
        
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }    
        for(int i=0;i<arr.length;i++){ //print the array

            System.out.println(arr[i]);
        }

    }

}
