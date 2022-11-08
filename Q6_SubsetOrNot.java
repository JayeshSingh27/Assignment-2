import java.util.*;
public class Q6_SubsetOrNot 

{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5}; //original Array
        int a[] = {1,3,2}; //subset array
        System.out.println(check(arr,a));
    }    

    public static boolean check(int arr[] , int a[])
    {
        Arrays.sort(arr);
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            if(arr[i] != a[i])
            {
                return false;
            }
        }
        return true;
    }

}
