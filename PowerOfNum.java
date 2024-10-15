// java program to find power of a number
import java.util.*;
public class PowerOfNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int a = sc.nextInt();

        System.out.print("enter power : ");
        int n = sc.nextInt();

        int power = 1;
        for(int i = 1;i <= n; i++){
            power = power*a;
        }

        System.out.println(power);
        sc.close();
    }
}
