public class mergeSort {
    public static int[] mergeSortAlgo(int[] arr1, int[] arr2){
        int[] arr3=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]>arr2[j])
            {
                arr3[k]=arr2[j];
                k++;j++;
            }
            else
            {
                arr3[k]=arr1[i];
                k++;i++;
            }
        }
        while(i<arr1.length)
        {
            arr3[k]=arr1[i];
            k++;i++;
        }
        while(j<arr2.length)
        {
            arr3[k]=arr2[j];
            k++;j++;
        }
        return arr3;
    }
    public static void main(String[] args) {
        int[] arr1={2,4,6,8,20};
        int[] arr2={3,6,9,12,15};
        int[] result=mergeSortAlgo(arr1, arr2);
        for (int i : result)
        {
            System.out.print(i+" ");
        }
    }
}
