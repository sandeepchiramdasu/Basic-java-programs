import java.util.*;
public class SumOfNaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        int ans = n*(n+1)/2;

        System.out.println("sum of first "+n+" natural numbers = "+ans);
        sc.close();
    }
}
