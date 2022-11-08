public class Q5_selectionsort 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,6,3,9,40,32};
        int[] ans = selectionsort(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }

    public static int[] selectionsort(int [] arr)
    {
   
        int n = arr.length; 
        for (int i = 0; i < n-1; i++)
        {
            int index = i;
            for (int j = i+1; j < n; j++)
            {
                if (arr[j] < arr[index])
                {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }        
        return arr;
    }
}
