// Java Program to find sum of elements in a given array
public class SumOfArray {

    static int sum(int arr[])
    {
        int sum = 0; 
        int i;
 
        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
 
    public static void main(String[] args)
    {
        int arr[] = {8,5,9,15,-3,7,-1};
        System.out.println("Sum of given array is "+ sum(arr));
    }
}

