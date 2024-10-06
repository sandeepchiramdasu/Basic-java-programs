import java.util.*;
public class InsertionSort {

    static void insertion(int arr[]){

        for(int i = 0; i < arr.length - 1; i++)
         {   
            int j = i + 1;
            // iterates until arr[j](current element) less than arr[j-1](before element)
            while(j > 0 && arr[j] < arr[j-1]){
                // swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
         }      
        //  Arrays.toString() method prints all array elements  
         System.out.println("After Sorting : "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr1[] = {2, -4, 5, 0, 8, 12, -1, -11};
        // input 1
        insertion(arr1);
        int arr2[] = {-8, 6, -4, 2, 0, -2, 4, -6, 8};
        // input 2
        insertion(arr2);        
    }
}


