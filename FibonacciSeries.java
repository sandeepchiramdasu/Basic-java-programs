// java program to print fibonacci series upto to n
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // input from user
        System.out.print("enter nth term : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");

        // iterate the loop upto n-2
        for(int i = 0; i < n - 2; i++)
        {
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        sc.close();
    }
}
