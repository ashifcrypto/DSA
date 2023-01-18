public class selectionSort{
    public static int[] selectionSortAlgo(int[] arr){
        int i = 0, j = 0;
        for (i = 0; i < arr.length; i++)
        {
            int min = arr[i];
            int minIndex = i;
            for (j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < min)
                {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = { 20, 12, 10, 15, 2, -1, 0 };
        int[] result = selectionSortAlgo(arr);
        for (int i : result)
        {
            System.out.print(i + " ");
        }
    }
}
