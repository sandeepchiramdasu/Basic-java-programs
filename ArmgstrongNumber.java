// java program to check armgstrong number or not
import java.util.*;
public class ArmgstrongNumber {
    static boolean armgstrong(int n){
        
        int sum = 0;

        // store n value in temporary variable
        int temp = n;

        boolean status = false;
        while(n != 0){
            int r = n%10;
            sum = sum + r*r*r;
            n = n/10;
        }
        if(sum == temp){
            status = true;
        }
        return status;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        System.out.println(armgstrong(num));
        sc.close();
    }
}
