// java program to find Greatest Common Divisor of two numbers
import java.util.*;
public class GCD {
    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        // input from user
        System.out.print("enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("enter second number : ");
        int n2 = sc.nextInt();

        // initially set gcd to 1
        int gcd = 1;

        for(int i = 1;i <= n1 && i <= n2;i++)
        {
            // check if i perfectly divides both n1 and n2
            if(n1%i == 0 && n2%i == 0)
            {
                gcd = i;
            }
        }
        System.out.println("GCD of "+n1+", "+n2+" = "+gcd);
        sc.close();
    }
}
