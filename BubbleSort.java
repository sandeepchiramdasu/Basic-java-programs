import java.util.*;
public class BubbleSort {
    static void bubble(int arr[]){
        for(int i = 0; i < arr.length; i++)
         {   
            for(int j = 0; j < arr.length - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
         }
         //  Arrays.toString() method prints all array elements        
         System.out.println("After Sorting : "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr1[] = {2,8,9,0,-1,5,-2,0};
        // input 1
        bubble(arr1);
        int arr2[] = {-1,9,0,-8,12,3,7,-3};
        // input 2
        bubble(arr2);
         
    }
}
