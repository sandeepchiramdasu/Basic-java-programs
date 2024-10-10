// java program to find palindrome or not
import java.util.*;
public class PalindromeNum {
    static boolean palindrome(int n){
        
        int rev = 0;

        // store n value in temporary variable
        int temp = n;

        boolean status = false;
        while(n != 0){
            int r = n%10;
            rev = rev*10 + r;
            n = n/10;
        }
        if(rev == temp){
            status = true;
        }
        return status;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        System.out.println(palindrome(num));
        sc.close();
    }
}
