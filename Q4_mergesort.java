public class Q4_mergesort
 {
    public static void main(String[] args)
    {
        int a[] = {9,90,30,20,56,43,6,78};
        mergeSort(a);
        System.out.println("Sorted Array : ");
        printArray(a);
       
    }

    public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

    public static void mergeSort(int arr[])
    {
        if(arr.length <= 1)
        {
            return;
        }
        int b[] = new int[arr.length/2];
        int c[] = new int[arr.length -b.length];

        for(int i=0;i<arr.length/2;i++)
        {
            b[i] = arr[i];
        }
        for(int i=arr.length/2;i<arr.length;i++)
        {
            c[i - arr.length/2] = arr[i];
        }
        mergeSort(b);
        mergeSort(c);
        merge(b,c,arr);
    }

    public static int[] merge(int[] s1, int[] s2 , int []arr)
    {
        int i=0,j=0,k=0;
        while( i<s1.length && j<s2.length)
        {
            if(s1[i] <= s2[j])
            {
                arr[k] = s1[i];
                i++;
                k++;
            }
            else 
            {
                arr[k] = s2[j];
                j++;
                k++;
            }
        }
        if(i < s1.length)
        {
            while(i < s1.length)
            {
                arr[k] = s1[i];
                i++;
                k++;
            }
        }

        if(j < s2.length)
        {
            while(j < s2.length)
            {
                arr[k] = s2[j];
                j++;
                k++;
            }
        }
        return arr;
       
        
    }
}
