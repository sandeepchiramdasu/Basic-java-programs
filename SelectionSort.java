import java.util.*;
public class SelectionSort {
    static void selection(int arr[]){

        for(int i = 0; i < arr.length - 1; i++)
         {   
            int min = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            // swap the min element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
         }   
         //  Arrays.toString() method prints all array elements     
         System.out.println("After Sorting : "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr1[] = {2,-4,5,0,8,12,-1,-11};
        // input 1
        selection(arr1);
        int arr2[] = {-8,6,-4,2,0,-2,4,-6,8};
        // input 2
        selection(arr2);
         
    }
}

