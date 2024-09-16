// Java program to convert a decimal number to binary number
import java.util.*;
class DecimalToBinary {
    // function to convert decimal to binary
    static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];
 
        // counter for binary array
        int i = 0;
        while (n > 0) 
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print("Binary - "+binaryNum[j]);
    }
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Decimal Number " );
        int n = sc.nextInt();
        decToBinary(n);
        sc.close();
    }
}
