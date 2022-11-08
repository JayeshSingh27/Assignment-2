class Q2_quicksort
{
    public static void main(String args[])
    {
        int a[] = {9,90,30,20,56,43,6,78};
        quickSort(a,0,a.length-1);
        System.out.println("Sorted Array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }     

    public static int partition(int a[],int si,int ei)
    {
        int pivotElement=a[si];
        int smallerNumCount=0;
        for(int i=si+1;i<=ei;i++){
            if(a[i]<pivotElement){
                smallerNumCount++;
            }
        }
        int temp=a[si+smallerNumCount];
        a[si+smallerNumCount]=pivotElement;
        a[si]=temp;
        int i=si;
        int j=ei;
        while(i<j){
            if(a[i]<pivotElement){
                i++;
            }else if(a[j]>=pivotElement){
                j--;
            }else{
                 temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        return si+smallerNumCount;
    }
    
    
    public static void quickSort(int[] input, int startIndex, int endIndex) 
    {
			// your code goes here
        if(startIndex>=endIndex){
            return;
        }
        int pivotIndex=partition(input,startIndex,endIndex);
        quickSort(input,startIndex,pivotIndex-1);
        quickSort(input,pivotIndex+1,endIndex);
    }	   
	
}
