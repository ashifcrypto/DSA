public class insertionSort {
    public static int[] insertionSortAlgo(int[] arr){
        int i=0;
        for(i=1; i<arr.length; i++)
        {
            int key=arr[i];
            int j=i;
            while(j>0 && arr[j-1]>key)
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=key;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={20,12,10,15,2,-1,0};
        int[] result=insertionSortAlgo(arr);
        for (int i : result)
        {
            System.out.print(i+" ");
        }
    }
}
